/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package lwjgl

import org.gradle.api.*
import java.io.*
import java.util.concurrent.*

object Lwjgl {

    val properties = mutableMapOf<String, String>()

    operator fun get(key: String): String? = properties[key]
    operator fun invoke(key: String): Boolean? = properties[key]?.equals("true")
    operator fun set(key: String, value: String?) = properties.put(key, value ?: "false")
    operator fun set(key: String, value: Boolean?) = properties.put(key, if (value == true) "true" else "false")
}

object env {
    operator fun get(variable: String): String? = System.getenv(variable)
}

val javacPresets = mutableMapOf<String, Javac>()

lateinit var gProject: Project
val gPath: String
    get() = gProject.projectDir.absolutePath

fun String.runCommand(workingDir: File = gProject.projectDir, println: Boolean = true): Boolean {
    val parts = split("\\s".toRegex()).toTypedArray()
    val proc = ProcessBuilder(*parts).directory(workingDir)
    if (println)
        proc.redirectOutput(ProcessBuilder.Redirect.PIPE)
            .redirectError(ProcessBuilder.Redirect.PIPE)

    return proc.start().waitFor(60, TimeUnit.MINUTES)
}