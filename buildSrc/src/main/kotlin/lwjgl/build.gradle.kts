/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */

package lwjgl

import lwjgl.sequence.*

val findbugs = "3.0.2"
val testng = "7.0.0"
//val jcommander = "1.78"
val joml = "1.10.0"
val jmh = "1.22"
//val joptSimple = "5.0.4"
//val commonsMath3 = "3.6.1"
val openjfx = "11.0.2"

repositories {
    mavenCentral()
}

configurations.create("javaDep")

dependencies {
    operator fun String.invoke(sources: Boolean = true) {
        "javaDep"(this)
        if (sources)
            "javaDep"("$this:sources")
    }
    "com.google.code.findbugs:jsr305:$findbugs"()
    //        "com.beust:jcommander:$jcommander"(false)
    "org.testng:testng:$testng"()
    "org.joml:joml:$joml"()
    "org.openjdk.jmh:jmh-core:$jmh"()
    "org.openjdk.jmh:jmh-generator-annprocess:$jmh"(false)
    //        "net.sf.jopt-simple:jopt-simple:$joptSimple"(false)
    //        "org.apache.commons:commons-math3:$commonsMath3"(false)

    if (Lwjgl["driftfx11"] != null) {
        File("$gPath/${Lwjgl["lib"]}/java/openjfx11").mkdir()
        if (Lwjgl["platform.linux"] != null) Lwjgl["platform.openjfx"] = "linux"
        if (Lwjgl["platform.macos"] != null) Lwjgl["platform.openjfx"] = "mac"
        if (Lwjgl["platform.windows"] != null) Lwjgl["platform.openjfx"] = "win"

        "org.openjfx:javafx-base:$openjfx:${Lwjgl["platform.openjfx"]}"(false) // subfolder ="/openjfx11"
        "org.openjfx:javafx-graphics:$openjfx:${Lwjgl["platform.openjfx"]}"(false) // subfolder = "/openjfx11"
    }
    build()
}

fun build() {

    gProject = rootProject

    Lwjgl["build.sysclasspath"] = "ignore"

    buildDefinitions()
    buildAssets()

    init()
    compileGenerator()
}

