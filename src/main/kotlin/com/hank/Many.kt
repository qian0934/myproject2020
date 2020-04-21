package com.hank

fun main() {
    val list = listOf(5,6,4,2,0) //不可變動
    println(list)
    val score = listOf(60,70,80,90,50)
    for (scores in score){
        println(scores)
    }
    println(list.get(3))
    var mutableList = mutableListOf(5,6,4,2,0) //mutableList可變動
    mutableList.add(8)
    println(mutableList)
}