/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package lwjgl

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
}