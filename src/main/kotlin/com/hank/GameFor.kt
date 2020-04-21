package com.hank

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val secret = Random().nextInt(10)+1
    println(secret)
    for (i in 1..5){
        print("Please enter a number(${i}/5):")
        var number = scanner.nextInt()
        println("第${i}次: $number")
        if (number > secret){
            println("Lower")
        }else if (number < secret){
            println("Higher")
        }else {
            println("Great,The number is : $secret")
            break
        }
    }
    println("結束")
}