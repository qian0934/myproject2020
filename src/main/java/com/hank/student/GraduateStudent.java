package com.hank.student;

public class GraduateStudent extends Student{
    int thesis;
    static int pass = 70;
    public GraduateStudent(String name, int english, int math,int thesis){
        super(name,english,math);
        this.thesis = thesis;
    }

    @Override
    public void print() {
        int Average = getAverage();
        System.out.print("學生姓名:"+name+'\t'+
                "英文成績:"+english+ '\t'
                +"數學成績:"+math+'\t'
                +"論文成績:"+thesis+'\t'
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
    }

    @Override
    public int getAverage() {
        return (english+math+thesis)/3;
    }
}
