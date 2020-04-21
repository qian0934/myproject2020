package com.hank

import java.util.*

fun main() {
//    val scanner = Scanner(System.`in`)
    val secret = Random().nextInt(10)+1
    println(secret)
    var number = 0
    while (number != secret){
        print("Please enter a number:")
        number = readLine()!!.toInt()
//        number = scanner.nextInt()
        if(number > secret){
            println("Lower")
        }else if (number < secret){
            println("Higher")
        }else{
            println("Great,The number is $secret")
        }
    }


}