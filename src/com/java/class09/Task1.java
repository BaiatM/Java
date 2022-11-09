package com.java.class09;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("To identify if it is a leap year, please enter a year  ");
        int year = sc.nextInt();

        if (year%4==0){

            if(year%400==0&&year%100==0){
                System.out.println("This is a leap year");
            }else if(year%100==0){
                System.out.println("This it not a leap year");
            }else{
                System.out.println("This is definitely a leap year");
            }
        }else{
            System.out.println("this is not a leap year");
        }

    }
}
