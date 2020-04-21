package com.hank.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secret = new Random().nextInt(10)+1;
        System.out.println(secret);
        for(int i = 1; i <= 4; i++){
            System.out.print("Please enter a number (" + i +"/4):");
            int number = scanner.nextInt();
            System.out.println("第" + i + "次 " + number);
            if(number > secret) {
                System.out.println("Lower");
            } else if (number < secret){
                System.out.println("Higher");
            } else {
                System.out.println("Great,The number is " + secret);
                break;
            }
        }
        System.out.println("結束");
    }
}
