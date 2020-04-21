package com.hank.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secret = random.nextInt(10)+1;//(0~9)+1
        System.out.println(secret);
        int number = 0;
        while (number != secret){
            System.out.print("Please enter a number:");
            number = scanner.nextInt();
            if(number < secret){
                System.out.println("Higher");
            }else if(number > secret){
                System.out.println("Lower");
            }else{
                System.out.println("Great , The number is " + secret);
            }
        }

    /*int i = 0 ;
        do{
            System.out.println(i);
            i++;
        }while (i<3);*/
    }
}
