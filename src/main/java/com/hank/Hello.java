package com.hank;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        Person p = new Person("strong",1.7f,66.5f);
        p.hello();
        /*p.name="Strong";
        p.height=1.7f;
        p.weight=66.5f;*/
        System.out.println(p.bmi());
        /*int age = 19;
        Integer age2 = 19;*/
    }
}
