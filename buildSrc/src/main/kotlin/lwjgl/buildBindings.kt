/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package lwjgl

import org.gradle.api.*
import java.io.*

fun buildBindings() {

    Lwjgl["binding.DISABLE_CHECKS"] = false

    // ========== BINDING FLAGS ========

    Lwjgl["notARM"] = Lwjgl("build.arch.x64")

    Lwjgl["binding.assimp"] = true
    Lwjgl["binding.bgfx"] = true
    Lwjgl["binding.bullet"] = true
    Lwjgl["binding.cuda"] = true
    Lwjgl["binding.driftfx"] = true
    Lwjgl["binding.egl"] = true
    Lwjgl["binding.glfw"] = true
    Lwjgl["binding.jawt"] = true
    Lwjgl["binding.jemalloc"] = true
    Lwjgl["binding.libdivide"] = true
    Lwjgl["binding.llvm"] = true
    Lwjgl["binding.lmdb"] = true
    Lwjgl["binding.lz4"] = true
    Lwjgl["binding.meow"] = Lwjgl("notARM")!! || Lwjgl("build.arch.arm64")!!
    Lwjgl["binding.meshoptimizer"] = true
    Lwjgl["binding.nanovg"] = true
    Lwjgl["binding.nfd"] = Lwjgl("notARM")
    Lwjgl["binding.nuklear"] = true
    Lwjgl["binding.odbc"] = true
    Lwjgl["binding.openal"] = true
    Lwjgl["binding.opencl"] = true
    Lwjgl["binding.opengl"] = true
    Lwjgl["binding.opengles"] = true
    Lwjgl["binding.openvr"] = Lwjgl("notARM")
    Lwjgl["binding.opus"] = true
    Lwjgl["binding.par"] = true
    Lwjgl["binding.remotery"] = true
    Lwjgl["binding.rpmalloc"] = true
    Lwjgl["binding.shaderc"] = true
    Lwjgl["binding.spvc"] = true
    Lwjgl["binding.sse"] = Lwjgl("notARM")
    Lwjgl["binding.stb"] = true
    Lwjgl["binding.tinyexr"] = true
    Lwjgl["binding.tinyfd"] = true
    Lwjgl["binding.tootle"] = Lwjgl("notARM")
    Lwjgl["binding.vma"] = true
    Lwjgl["binding.vulkan"] = true
    Lwjgl["binding.xxhash"] = true
    Lwjgl["binding.yoga"] = true
    Lwjgl["binding.zstd"] = true

    // TODO: automate
    Lwjgl["java-only.binding.cuda"] = true
    Lwjgl["java-only.binding.egl"] = true
    Lwjgl["java-only.binding.jawt"] = true
    Lwjgl["java-only.binding.odbc"] = true
    Lwjgl["java-only.binding.opencl"] = true

    // Set the path to the Oculus SDK to enable.
    // TODO: add headers in here
    val ovrSdk = File(gProject.projectDir.parent + File.pathSeparatorChar + "OculusSDK")
    if(ovrSdk.exists())
        Lwjgl["binding.ovr"] = File("${ovrSdk.absolutePath}/LibOVR/Include/OVR_CAPI.h").run { exists() && canRead() }
}