/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package lwjgl

import org.apache.tools.ant.taskdefs.*
import org.apache.tools.ant.taskdefs.condition.*
import org.apache.tools.ant.types.*
import org.gradle.api.JavaVersion
import java.io.*

fun buildDefinitions() {
    /*  The target native architecture.
        By default, os.arch of the JVM that runs ANT is used, but this can be overridden for cross-compiling to another architecture.
        Valid values: x64, x86, arm64, arm32     */
    val osArch = System.getProperty("os.arch")
    Lwjgl["build.arch"] = env["LWJGL_BUILD_ARCH"] ?: if ("64" in osArch) "x64" else "x86" // TODO inline?

    val arch = Lwjgl["build.arch"]!!
    if (arch != "x64" && arch != "x86" && arch != "arm64" && arch != "arm32")
        error("Invalid or unsupported build architecture: $arch. Supported: x64, x86, arm64, arm32")

    Lwjgl["build.arch.$arch"] = true
    if (arch.startsWith("arm"))
        Lwjgl["build.arch.arm"] = true

    buildBindings()

    /*  This is used as the source of binary dependencies. Valid values:
        - nightly
            the latest successful build. Dependency repos can be found here: https://github.com/LWJGL-CI
            this is the default, set the LWJGL_BUILD_TYPE environment variable to override.
        - stable
            the latest nightly build that has been verified to work with LWJGL.
        - release/latest
            the latest stable build that has been promoted to an official LWJGL release.
        - release/{build.version}
            a specific previously released build.   */
    Lwjgl["build.type"] = env["LWJGL_BUILD_TYPE"] ?: "nightly"

    /*  This is used to override the default output directory. By default, the directories
        bin, generated and release will be created in the same directory as the main build
        script. These 3 directories will contain thousands of tiny files, so you may want
        to override their location due to performance characteristics of the storage
        hardware.

        Note that when this property is set, the directories bin, generated and release
        will be symlinks to the corresponding directories in LWJGL_BUILD_OUTPUT. The ant
        scripts and IDE projects always work with paths relative to the project root.   */
    env["LWJGL_BUILD_OUTPUT"]?.let { Lwjgl["build.output"] = it }

    Lwjgl["lib"] = "bin/libs"

    Lwjgl["kotlinc"] = "${Lwjgl["lib"]}/kotlinc"

    Lwjgl["module.lwjgl"] = "modules/lwjgl"

    Lwjgl["src.ant"] = "modules/ant/src/main"
    Lwjgl["src.extract"] = "modules/extract/src/main"
    Lwjgl["src.generator"] = "modules/generator/src/main"

    Lwjgl["test.resources"] = "modules/samples/src/test/resources"

    Lwjgl["bin.ant"] = "bin/classes/ant"
    Lwjgl["bin.extract"] = "bin/classes/extract"
    Lwjgl["bin.generator"] = "bin/classes/generator"
    Lwjgl["bin.javadoc"] = "bin/javadoc"
    Lwjgl["bin.lwjgl"] = "bin/classes/lwjgl"
    Lwjgl["bin.samples"] = "bin/classes/samples"
    Lwjgl["bin.templates"] = "bin/classes/templates"
    Lwjgl["bin.test"] = "bin/classes/test"
    Lwjgl["bin.test.html"] = "bin/test"

    Lwjgl["release"] = "bin/RELEASE"
    Lwjgl["release.doc"] = "${Lwjgl["release"]}/doc"
    Lwjgl["release.jar"] = "${Lwjgl["release"]}/jar"
    Lwjgl["release.native"] = "${Lwjgl["release"]}/native"

    /*  Offline build flag. This is useful when working offline, or when custom binary dependencies
        are used (so they are not overridden). Set to one of true/on/yes to enable.     */
    Lwjgl["build.offline"] = env["LWJGL_BUILD_OFFLINE"]

    when {
        Os.isFamily(Os.FAMILY_UNIX)    -> {
            Lwjgl["platform.linux"] = true
            Lwjgl["platform"] = "linux"
        }
        Os.isFamily(Os.FAMILY_MAC)     -> {
            Lwjgl["platform.macos"] = true
            Lwjgl["platform"] = "macosx"
        }
        Os.isFamily(Os.FAMILY_WINDOWS) -> {
            Lwjgl["platform.windows"] = true
            Lwjgl["platform"] = "windows"
        }
    }

    Lwjgl["platform.remote"] = if(Lwjgl["platform.linux"] != null) "macosx" else Lwjgl["platform"]

    Lwjgl["platform.linux.remote"] = "linux"
    Lwjgl["platform.macos.remote"] = "macosx"
    Lwjgl["platform.windows.remote"] = "windows"

    Lwjgl["lib.native"] = "${Lwjgl["lib"]}/native/${Lwjgl["platform"]}/${Lwjgl["build.arch"]}"

    /* Detect version of JDK running the Ant build. */
    if(JavaVersion.current() == JavaVersion.VERSION_14)
        Lwjgl["jdk14"] = true
    if(Lwjgl["jdk14"] != null || JavaVersion.current() == JavaVersion.VERSION_13)
        Lwjgl["jdk13"] = true
    if(Lwjgl["jdk13"] != null || JavaVersion.current() == JavaVersion.VERSION_12)
        Lwjgl["jdk12"] = true
    if(Lwjgl["jdk12"] != null || JavaVersion.current() == JavaVersion.VERSION_11)
        Lwjgl["jdk11"] = true
    if(Lwjgl["jdk11"] != null || JavaVersion.current() == JavaVersion.VERSION_1_10)
        Lwjgl["jdk10"] = true
    if(Lwjgl["jdk10"] != null || JavaVersion.current() == JavaVersion.VERSION_1_9)
        Lwjgl["jdk9"] = true

//    <!-- May be set in the ant command line to test multi-release implementations. -->
//    <condition property="core.java13"><isset property="core.java14"/></condition>
//    <condition property="core.java12"><isset property="core.java13"/></condition>
//    <condition property="core.java11"><isset property="core.java12"/></condition>
//    <condition property="core.java10"><isset property="core.java11"/></condition>
//    <condition property="core.java9"> <isset property="core.java10"/></condition>

    Lwjgl["jni.headers"] = when {
        Lwjgl["jdk9"] != null -> "${Lwjgl["java.home"]}/include"
        else                  -> "${Lwjgl["java.home"]}/../include"
    }
    if(Lwjgl["jdk9"] != null && Lwjgl["env.JAVA8_HOME"] != null)
        Lwjgl["set-boot-class-path"] = true

    /* Different location per platform/architecture. This is intentional. */
    Lwjgl["bin.native"] ="bin/${Lwjgl["platform"]}/${Lwjgl["build.arch"]}"

    javacPresets["lwjgl.javac"] = Javac(source="8", target="8").apply {
        if (Lwjgl["set-boot-class-path"] != null)
            args +="--boot-class-path \"${env["JAVA8_HOME"]}/jre/lib/rt.jar\""
        args += "-Xlint:all"
        args += "-XDignore.symbol.file" // Suppresses internal API (e.g. Unsafe) usage warnings
    }

    javacPresets["lwjgl.javac9"] = Javac().apply {
        args += "--release 9 -Xlint:all -XDignore.symbol.file"
    }

    javacPresets["lwjgl.javac10"] = Javac().apply {
        args += "--release 10 -Xlint:all -XDignore.symbol.file"
    }

    javacPresets["lwjgl.javac11"] = Javac().apply {
        args += "--release 11 -Xlint:all -XDignore.symbol.file"
    }

    Lwjgl["driftfx11"] = Lwjgl["binding.driftfx"] == "true" && Lwjgl["jdk11"] == "true"

    // [Gradle] custom ant default definitions
    Lwjgl["libs"] = "bin/libs"
    Lwjgl["kotlinc"] = "bin/libs/kotlinc"
}

fun mkdirSymlink(name: String) {
    val dir = File(name)
    // in the repo root
    if (Lwjgl["build.output"] == null) {
        if (!(dir.exists() && dir.isDirectory))
            dir.mkdir()
    }
    // or in LWJGL_BUILD_OUTPUT
    val buildOutput = Lwjgl["build.output"]?.let(::File)
    val useSymlink = buildOutput != null && !dir.exists()
    if (useSymlink) {
        if (!buildOutput!!.exists())
            buildOutput.mkdir()
        TODO("2") // <mkdir dir="${build.output}/@{dir}" if:set="useSymlink"/>
    }

    if (useSymlink)
        if (Os.isFamily(Os.FAMILY_WINDOWS)) { // Create symlink from root to LWJGL_BUILD_OUTPUT (Windows)
            "cmd /c mklink /J ${dir.absolutePath} $buildOutput\\${dir.absolutePath}".runCommand()
        } else // Create symlink from root to LWJGL_BUILD_OUTPUT (Unix)
            TODO("3") // <symlink link="@{dir}" resource="${build.output}/@{dir}" if:set="useSymlinkUnix"/>
}

fun deleteSymlink(name: String) {
    val dir = Lwjgl["dir"]!!
    Lwjgl["build.output"]?.let {
        File(it + File.separatorChar + dir).delete()
    }
    File(dir).delete()
}

//<macrodef name="confirm-replace">
//<attribute name="dir"/>
//<attribute name="msg"/>
//
//<sequential>
//<local name="dir.exists"/>
//<available file="@{dir}" type="dir" property="dir.exists"/>
//
//<local name="input"/>
//<input
//message="@{msg}"
//validargs="y,n"
//defaultvalue="n"
//addproperty="input"
//if:set="dir.exists"
///>
//<fail message="Cancelled" if:set="dir.exists">
//<condition if:set="dir.exists">
//<equals arg1="n" arg2="${input}"/>
//</condition>
//</fail>
//</sequential>
//</macrodef>
//
//<macrodef name="get-quiet">
//<attribute name="name"/>
//<attribute name="url"/>
//<attribute name="dest"/>
//<attribute name="skipexisting" default="true"/>
//
//<sequential>
//<quiet>
//<get taskname="@{name}" src="@{url}" dest="@{dest}" usetimestamp="true" skipexisting="@{skipexisting}"/>
//</quiet>
//</sequential>
//</macrodef>
//
//<macrodef name="update-mvn">
//<attribute name="name"/>
//<attribute name="group"/>
//<attribute name="artifact"/>
//<attribute name="version"/>
//<attribute name="classifier" default=""/>
//<attribute name="subfolder" default=""/>
//<attribute name="sources" default="true"/>
//
//<sequential>
//<get-quiet name="@{name}" url="https://repo.maven.apache.org/maven2/@{group}/@{artifact}/@{version}/@{artifact}-@{version}@{classifier}.jar" dest="${lib}/java@{subfolder}/@{artifact}.jar" skipexisting="false"/>
//<get-quiet name="@{name}" url="https://repo.maven.apache.org/maven2/@{group}/@{artifact}/@{version}/@{artifact}-@{version}-sources.jar" dest="${lib}/java@{subfolder}/@{artifact}-sources.jar" skipexisting="false" if:true="@{sources}"/>
//</sequential>
//</macrodef>
//
//<macrodef name="update-dependency">
//<attribute name="module"/>
//<attribute name="artifact"/>
//
//<sequential>
//<sequential if:true="${binding.@{module}}">
//<local name="dest"/>
//<property name="dest" value="${lib.native}/${module.@{module}.path}"/>
//<mkdir dir="${dest}"/>
//<get-quiet name="@{module} :: @{artifact}" url="https://build.lwjgl.org/${build.type}/${platform.remote}/${build.arch}/@{artifact}" dest="${dest}" skipexisting="false"/>
//</sequential>
//</sequential>
//</macrodef>