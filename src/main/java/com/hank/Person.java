package com.hank;

public class Person {
    String name;
    float height;
    float weight;
    public Person(float height,float weight){
        this.height=height;
        this.weight=weight;
    }

    public Person(String name,float height,float weight){
        this(height, weight);
        this.name=name;

    }

    public float bmi(){
        float bmi = weight / (height*height);
        return bmi;
    }

    public void hello(){
        System.out.println("Hello World");

    }
}
