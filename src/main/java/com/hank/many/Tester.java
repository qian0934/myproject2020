package com.hank.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        //map<key,value> 不排序,無index,key一樣會覆蓋
        HashMap<String , String> stocks = new HashMap<>();
        stocks.put("2331","台積電");
        stocks.put("2317","鴻海");
        stocks.put("2331","TSMC");
        System.out.println(stocks.get("2331"));
        System.out.println(stocks);
        for(String key : stocks.keySet()){
            System.out.println(stocks.get(key));
        }
        //        set();
        //        list();
        //        arrayTest();
    }

    private static void set() {
        //set 不重複資料與不排序,無index
        HashSet<Integer> set = new HashSet<>();
        set.add(9);
        set.add(7);
        set.add(8);
        set.add(4);
        set.add(0);
        set.add(8);
        System.out.println(set);
        for(int n : set){
            System.out.println(n);
        }
    }

    private static void list() {
        ArrayList<Integer> list = new ArrayList();
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(8);
        list.add(1);
        System.out.println(list);
        int n1 = list.get(3);
        int n2 = list.get(4);
        System.out.println(n1+n2);
        System.out.println(list.size());
        List<Integer> scores = Arrays.asList(60,70,80,90,50);
        System.out.println(scores);
        for(int score : scores){
            System.out.println(score);
        }
    }

    private static void arrayTest() {
        int[] number = new int[5];
        number[0] = 5;
        number[1] = 1;
        number[4] = 7;
        int [] scores = {60,70,80,90,50};
        for(int i=0; i<=4; i++){
            System.out.println(scores[i]);
        }
        for(int n : scores){
            System.out.println(n);
        }
    }
}
