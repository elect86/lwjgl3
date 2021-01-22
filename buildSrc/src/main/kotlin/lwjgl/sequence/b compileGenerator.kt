package lwjgl.sequence

import lwjgl.Lwjgl
import lwjgl.gPath
import org.gradle.api.file.*
import java.io.*
import lwjgl.runCommand

fun compileGenerator() {
    val target= File("${Lwjgl["bin.generator"]}/touch.txt").lastModified()
    val sources = File("${Lwjgl["src.generator"]}/kotlin").listFiles()!!
    val generatorUpToDate = sources.all { target < it.lastModified() }.also { Lwjgl["generator-uptodate"] = it }

    if (!generatorUpToDate)
        println("[Generator] Compiling Kotlin generator...")// level="info" taskname="Generator" unless:set="generator-uptodate"/>
    File(Lwjgl["bin.generator"]!!).mkdir()
    if(!generatorUpToDate) {
        val args = "-module-name generator -output ${Lwjgl["bin.generator"]} -jvm-target 1.8 -Xno-call-assertions -Xno-param-assertions -Xreport-perf -progressive"
        println(Lwjgl["bin.generator"])
        val kotlinc = "$gPath/${Lwjgl["kotlinc"]}/bin/kotlinc.sh"
        "chmod +x $kotlinc".runCommand()
        "$kotlinc $args".runCommand()
    }

//    <src path="${src.generator}/kotlin"/>
//    </kotlinc>
//    <touch file="${bin.generator}/touch.txt" unless:set="generator-uptodate"/>
//
//    <lwjgl.javac
//    destdir="${bin.generator}"
//
//    srcdir="${src.generator}/java"
//    includes="org/lwjgl/**"
//
//    taskname="javac: Generator Tools"
//    />
//    </target>
}