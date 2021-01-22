package lwjgl.linux

import lwjgl.Lwjgl

fun build() {
    Lwjgl["gcc.prefix"] = when {
        Lwjgl["build.arch.arm64"] == "true" -> "aarch64-linux-gnu-"
        Lwjgl["build.arch.arm32"] == "true" -> "arm-linux-gnueabihf-"
        else                                -> ""
    }
    Lwjgl["gcc.suffix"] = Lwjgl["gcc.version"]?.let { "-$it" } ?: ""

    Lwjgl["module.lwjgl.rel"] = "../../../../${Lwjgl["module.lwjgl"]}"
}