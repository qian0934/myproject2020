package com.hank.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
        Student.pass = 60;
        Student stu = new Student("Strong",20,99);
        Student stu2 = new Student("Hank",90,100);
        Student stu3 = new Student("Eric",70,50);
        GraduateStudent gst = new GraduateStudent("Jack",60,60,99);
        gst.print();
        stu.print();
        stu2.print();
        stu3.print();
        System.out.println("highest:" + stu.highest());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student's name:");
        String name = scanner.next();
        System.out.println("Please enter student's english:");
        int english = scanner.nextInt();
        System.out.println("Please enter student's math:");
        int math = scanner.nextInt();
        Student stu = new Student(name,english,math);
        stu.print();
        System.out.println("highest:" + stu.highest());
    }
}
