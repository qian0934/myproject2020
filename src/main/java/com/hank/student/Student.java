package com.hank.student;

public class Student {
    String id;
    String name;
    int english;
    int math;
    static int pass = 50;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }
    public int highest(){
        return (english > math) ? english : math;
        /*int max;
        if (english>math){
            return max = english;
        }else {
            return max = math;
        }*/
    }
    public void print(){
        int Average = getAverage();
        System.out.print("學生姓名:"+name+'\t'+
                "英文成績:"+english+ '\t'
                +"數學成績:"+math+'\t'
                +"平均成績:"+getAverage() + '\t'
                + ((Average >= pass) ? "PASS" : "FAILED"));

        char grading = 'F';
        switch (Average/10){
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
        }
        System.out.println("\t" + grading);
        /*if(getAverage() >= 60){
            System.out.println("\tPASS");
        }else{
            System.out.println("\tFAILED");
        }*/
    }
    public int getAverage(){
        return (english+math)/2;
    }
}
