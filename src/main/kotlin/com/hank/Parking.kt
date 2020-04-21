package com.hank

import java.time.Duration
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val enter = LocalDateTime.of(
        2020,4,17,3,20)
    val leave = LocalDateTime.of(
        2020,4,17,5,45)

    val car = Car("ABC-9876",enter)
    car.leave = leave
    println(car.duration())
    val hours = Math.ceil(car.duration()/60.0).toLong()
    println(hours)
}

class Car(val id:String,val enter:LocalDateTime){
    var leave:LocalDateTime? = null
        set(value) {
            if(enter.isBefore(value))
                field = value           //field -> leave
        }
    fun duration() = Duration.between(enter,leave).toMinutes()
}