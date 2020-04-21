package com.hank

fun main() {
//    println("Hello World")
//    Human().hello()
    val h = Human(weight = 66.5f,height = 1.7f)
    h.hello()
    println(h.bmi())
   /* val a = 19
    var name : String
    name ="strong"*/
}

class Human(var name:String="",var weight:Float,var height:Float){
    init { //額外程式 建構子完成執行
        println("test $weight")
    }
//    constructor(name:String,weight: Float,height: Float):this(weight,height)
    fun bmi():Float{
        val bmi=weight/(height*height)
        return bmi
    }
    fun hello(){
        println("Hello kotlin")
    }
}