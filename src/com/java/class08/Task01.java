package com.java.class08;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number to identify if it is divisible by 5 ");
        int num1 = sc.nextInt();
        if (num1%5==0){
            System.out.println("The given number is Divisible by 5");
        }else{
            System.out.println("The given number is Not divisible by 5");
        }
    }
}
/*Write a program to take number from user and print if it's divisible by 5 or not
Example
Input - 6
Output - Not divisible
Input - 35
Output - Divisible*/