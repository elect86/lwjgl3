/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */

package lwjgl

import org.apache.tools.ant.taskdefs.condition.*

plugins {
    `java-library`
}

//fun build() {
//
//}

fun buildDefinitions() {
    /*  The target native architecture.
        By default, os.arch of the JVM that runs ANT is used, but this can be overridden for cross-compiling to another architecture.
        Valid values: x64, x86, arm64, arm32     */
    Build.arch = env["LWJGL_BUILD_ARCH"] ?: if ("64" in env["os.arch"]!!) "x64" else "x86" // TODO inline?

    if (Build.arch != "x64" && Build.arch != "x86" && Build.arch != "arm64" || Build.arch != "arm32")
        error("Invalid or unsupported build architecture: ${Build.arch}. Supported: x64, x86, arm64, arm32")

    Lwjgl["build.arch.${Build.arch}"] = "true"
    if(Build.arch.startsWith("arm"))
        Lwjgl["build.arch.arm"] = "true"

    buildBinding()
}

/** Initializes the directories required by the build process */
fun init() {


}

fun mkdirSymlink(name: String) {
    val dir = File(name)
    if (Build.output == null) {
        if (!(dir.exists() && dir.isDirectory))
            dir.mkdir()
    }
    val buildOutput = Build.output?.let(::File)
    val useSymlink = buildOutput != null && !dir.exists()
    if (useSymlink) {
        if (!buildOutput!!.exists())
            buildOutput.mkdir()
        TODO()
//        buildOutput.
    }

    if (useSymlink)
        if (Os.isFamily(Os.FAMILY_WINDOWS)) {
            Runtime.getRuntime().exec("cmd /c mklink /J ${dir.absolutePath} $buildOutput\\${dir.absolutePath}")
        } else
            TODO() // <symlink link="@{dir}" resource="${build.output}/@{dir}" if:set="useSymlinkUnix"/>
}

fun bindingConfig() {

    operator fun String.invoke(): Boolean = Lwjgl[this]!!.toBoolean()

    if ("binding.nanovg"())
        check(!"binding.stb"() || !("binding.bgfx"() || "binding.opengl"() || "binding.opengles"())) {
            "The nanovg module depends on the stb and one of bgfx/OpenGL/OpenGL ES modules."
        }

    if ("binding.ovr"())
        check(!"binding.opengl"() && !"binding.vulkan"()) { "The OpenGL or Vulkan bindings are required." }

    val modules = arrayListOf("core")
    val bindings = arrayListOf("-Dbinding.DISABLE_CHECKS=${Lwjgl["binding.DISABLE_CHECKS"]}")
}