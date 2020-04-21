package com.hank;

import com.hank.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    void highestTest(){
        Student student = new Student("Strong",80,60);
        Assertions.assertEquals(80,student.highest());
    }

    @Test
    void averageTest(){
        Student student = new Student("Strong",80,60);
        Assertions.assertEquals((80+60)/2,student.getAverage());
    }
}
