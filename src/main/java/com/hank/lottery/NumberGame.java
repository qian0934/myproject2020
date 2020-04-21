package com.hank.lottery;

import java.util.HashSet;
import java.util.Set;

public abstract class NumberGame {
    int numberCount = 0;
    Set<Integer> numbers = new HashSet<>();

    public abstract void generate();
    public boolean validate(){
       if (numbers.size() == numberCount){
           return true;
       }else {
           return false;
       }
    }

}
