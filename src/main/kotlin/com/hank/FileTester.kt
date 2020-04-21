package com.hank

import java.io.File

fun main() {
    File("data.txt").bufferedReader().lines().forEach {
        println(it)
    }

//    write()
}

private fun write() {
    File("output.txt").bufferedWriter().use {
        it.write("adc line\n")
        it.write("efg line\n")
        it.write("Strong line\n")
    }
    /*File("output.txt").printWriter().use {
    it.println("1st line")
    it.println("2nd line")
    it.println("3rd line")
}*/
}