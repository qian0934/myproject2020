package com.hank.kotlin

import com.hank.kolin.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {

    @Test
    fun highestTest(){
        val student = Student("Strong",80,90)
        Assertions.assertEquals(90,student.highest())
    }

    @Test
    fun averageTest(){
        val student = Student("Strong",80,90)
        Assertions.assertEquals((80+90)/2,student.getAverage())
    }

    @Test
    fun gradingTest(){
        val student = Student("Strong",80,90)
        Assertions.assertEquals('B',student.grading())
    }
}