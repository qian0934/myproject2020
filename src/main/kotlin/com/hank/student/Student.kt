package com.hank.kotlin

import java.util.*

fun main() {
//    uesrInput()
    Student.pass = 50
    val stu = Student("Strong", 20, 88)
    val stu2 = Student("Jane",70,80)
    val stu3 = Student("Eric",45,30)
    val gst = GraduateStudent("Jack",40,40,90)
    gst.print()
    stu.print()
    stu2.print()
    stu3.print()
    println("highest: ${stu.highest()}")


}

class GraduateStudent(name: String?,english: Int,math: Int,var thesis:Int) : Student(name,english,math){
    companion object{
        var pass = 70
    }

    override fun print() {
        println(
            "學生姓名:$name\t 英文成績:$english\t 數學成績:$math\t 論文成績:$thesis\t 平均成績:${getAverage()}\t ${grading()}\t " +
                    "${passOrfailed()}")
    }

    override fun passOrfailed() = if(getAverage() >= pass) "PASS" else "FAILED"

    override fun getAverage() = (english+math+thesis)/3
}

open class Student(var name:String?,var english:Int,var math:Int) {

    companion object{
        @JvmStatic
        var pass = 90
        fun test(){
            println("Testprint")
        }
    }

    open fun print() {
        println(
            "學生姓名:$name\t 英文成績:$english\t 數學成績:$math\t 平均成績:${getAverage()}\t ${grading()}\t " +
                    "${passOrfailed()}")
    }

    fun grading() = when (getAverage()) {
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    open fun passOrfailed() = if(getAverage() >= pass) "PASS" else "FAILED"

    open fun getAverage() = (english + math) / 2

    fun highest() = if (english>math){
        println("english")
        english
    }else{
        println(math)
        math
    }

    fun namecheck() = println(name?.length)
}

private fun uesrInput() {
    val scanner = Scanner(System.`in`)
    print("Please enter student's name:")
//    var name = scanner.next()
    var name = null
    print("Please enter student's englis:")
    var english = scanner.nextInt()
    print("Please enter student's math:")
    var math = scanner.nextInt()

    val stu = Student(name, english, math)
    stu.print()
    stu.namecheck()

}