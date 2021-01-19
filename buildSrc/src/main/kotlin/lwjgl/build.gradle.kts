/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */

package lwjgl

import org.apache.tools.ant.taskdefs.condition.*

plugins {
    `java-library`
}

fun build() {

}

fun buildDefinitions() {
    /*  The target native architecture.
        By default, os.arch of the JVM that runs ANT is used, but this can be overridden for cross-compiling to another architecture.
        Valid values: x64, x86, arm64, arm32     */
    build.arch = env["LWJGL_BUILD_ARCH"] ?: if ("64" in env["os.arch"]!!) "x64" else "x86" // TODO inline?

    if (build.arch != "x64" && build.arch != "x86" && build.arch != "arm64" || build.arch != "arm32")
        error("Invalid or unsupported build architecture: ${build.arch}. Supported: x64, x86, arm64, arm32")

    Lwjgl["build.arch.${build.arch}"] = "true"
    if(build.arch.startsWith("arm"))
        Lwjgl["build.arch.arm"] = "true"

    buildBinding()
}

/** Initializes the directories required by the build process */
fun init() {


}

object build {
    var output: String? = null
    lateinit var arch: String
}

fun mkdirSymlink(name: String) {
    val dir = File(name)
    if (build.output == null) {
        if (!(dir.exists() && dir.isDirectory))
            dir.mkdir()
    }
    val buildOutput = build.output?.let(::File)
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