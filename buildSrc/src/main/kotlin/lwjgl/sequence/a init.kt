package lwjgl.sequence

import lwjgl.*
import java.io.*
import java.nio.file.*

/** Initializes the directories required by the build process */
fun init() {

    env["LWJGL_BUILD_TYPE"]?.let { println("[override] Build type: ${Lwjgl["build.type"]}") }
    env["LWJGL_BUILD_OUTPUT"]?.let { println("[override] Build output: ${Lwjgl["build.output"]}") }
    env["LWJGL_BUILD_ARCH"]?.let { println("[override] Build architecture: ${Lwjgl["build.arch"]}") }
    env["LWJGL_BUILD_OFFLINE"]?.let { println("[override] Build offline: ${Lwjgl["build.offline"]}") }

    mkdirSymlink("bin")

    bindingConfig()

    setKotlincProperties()
    checkDependencies()
}

fun bindingConfig() {

    operator fun String.invoke(): Boolean = Lwjgl[this]?.toBoolean() == true

    if ("binding.nanovg"())
        check("binding.stb"() && ("binding.bgfx"() || "binding.opengl"() || "binding.opengles"())) {
            "The nanovg module depends on the stb and one of bgfx/OpenGL/OpenGL ES modules."
        }

    if ("binding.ovr"())
        check("binding.opengl"() || "binding.vulkan"()) { "The OpenGL or Vulkan bindings are required." }

    val modules = arrayListOf("core")
    val bindings = arrayListOf("-Dbinding.DISABLE_CHECKS=${Lwjgl["binding.DISABLE_CHECKS"]}")

    for ((key, value) in Lwjgl.properties)
        if (key.startsWith("binding.") && value == "true") {
            modules += key.substring(8)
            bindings += "-D$key=true"
        }

    Lwjgl["binding.core"] = true
    Lwjgl["generator.bindings"] = bindings.joinToString(separator = " ")
    Lwjgl["module.list"] = modules.joinToString(separator = ",")

    val classes = ArrayList<String>(modules.size)
    val templates = ArrayList<String>(modules.size)
    val sources = ArrayList<String>(modules.size * 2)

    modules.forEach {
        Lwjgl["module.$it.path"] = if (it == "core") "org/lwjgl" else "org/lwjgl/$it"

        classes += "bin/classes/lwjgl/$it"

        val src = "modules/lwjgl/$it/src"

        templates += "$src/templates/kotlin"
        sources += "$src/generated/java"
        if (Files.isDirectory(Paths.get("$src/main/java")))
            sources += "$src/main/java"
    }

    Lwjgl["module.classpath"] = classes.joinToString(separator = File.pathSeparator)
    Lwjgl["module.templatepath"] = templates.joinToString(separator = File.pathSeparator)
    Lwjgl["module.sourcepath"] = sources.joinToString(separator = File.pathSeparator)
    Lwjgl["module.javadocsourcepath"] = sources.filter { "driftfx/src/main/java" !in it }.joinToString(separator = File.pathSeparator)
}