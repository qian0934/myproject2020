package com.kotlin

import java.util.*

data class Ticket(val origin : Int, val destination : Int, val price : Int)

fun main() {
//    var ticket = Ticket(20,40,500)
    val s = "abcd"
    println(s.validate())
    println((1..10).random())
//    val r = Random().nextInt(10) + 1 //java寫法 
}

fun String.validate() : Boolean {  //擴充String功能
    return this.length >= 6
}

fun IntRange.random() : Int {
    val r = Random().nextInt(endInclusive - start)+start
    return r
}