package lwjgl

import org.gradle.kotlin.dsl.*
import java.io.*


fun setKotlincProperties() {
    Lwjgl["kotlinc-version"] = "1.4.10"
    Lwjgl["kotlinc-build"] = "1.4.10-release-411"
}

/** Updates LWJGL dependencies, if required */
fun checkDependencies() {
    if(Lwjgl["build.offline"]?.toBoolean() == true)
        return
    // Checks if the Kotlin compiler must be updated
    val txt = File("${Lwjgl["kotlinc"]}/build.txt")
    val kotlincBuildCurrent = if (txt.exists() && txt.canRead()) txt.readText() else ""
    Lwjgl["kotlinc-build-current"] = kotlincBuildCurrent
    Lwjgl["kotlinc-uptodate"] = kotlincBuildCurrent.isNotBlank() && kotlincBuildCurrent == Lwjgl["kotlinc-build"]

    val source = File("$gPath/buildSrc/src/main/kotlin/lwjgl/updateDependencies.kt")
    val target = File("$gPath/${Lwjgl["lib"]}/touch.txt")
    Lwjgl["lib-uptodate"] = target.lastModified() > source.lastModified()

    val dependenciesUptodate = Lwjgl["kotlinc-uptodate"]!!.toBoolean() && Lwjgl["lib-uptodate"]!!.toBoolean()
    println("dependenciesUptodate=$dependenciesUptodate")
    println("kotlinc-uptodate=${Lwjgl["kotlinc-uptodate"]}")
    println("lib-uptodate=${Lwjgl["lib-uptodate"]}")
    if(!dependenciesUptodate)
        updateDependencies()
}

/** Updates LWJGL dependencies */
fun updateDependencies() {
    if(Lwjgl["build.offline"]?.toBoolean() == true)
        return
    // ~set log level to info
    //<taskdef name="logLevel" classname="org.lwjgl.SetLogLevel" classpath="${bin.ant}"/>

    val lib = "$gPath/${Lwjgl["lib"]}"
    File(lib).mkdir()
    File("$lib/java").mkdir()
    libDownload(lib)
    kotlincDownload(lib)
}

/** Downloads the Java dependencies. */
fun libDownload(dir: String) {

    if(Lwjgl["lib-uptodate"]?.toBoolean() == true)
        return

    gProject.configurations["javaDep"].forEach {
        var target = "$dir/java"
        if ("openjfx" in it.toString())
            target += "/openjfx11"
        it.copyTo(File("$target/${it.name}"))
    }

    File("$dir/touch.txt").createNewFile()
}

/** Downloads and extracts the Kotlin compiler. */
fun kotlincDownload(dir: String) {

    val kotlincArchive = "kotlin-compiler-${Lwjgl["kotlinc-version"]}.zip"

    // Download new build
//    <get taskname="kotlinc" src="https://github.com/JetBrains/kotlin/releases/download/v${kotlinc-version}/${kotlinc-archive}" dest="${lib}" verbose="true"/>

//    <!-- Delete current build -->
//    <delete dir="${kotlinc}" taskname="kotlinc"/>
//    <!-- Extract build -->
//    <unzip src="${lib}/${kotlinc-archive}" dest="${lib}" taskname="kotlinc"/>
//    <!-- Delete build archive -->
//    <delete file="${lib}/${kotlinc-archive}" taskname="kotlinc"/>
//
//    <echo message="The Kotlin compiler was updated to build: ${kotlinc-version}" taskname="kotlinc"/>
}
