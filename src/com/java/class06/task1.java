package com.java.class06;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write down any number to get it squared");
        int num = sc.nextInt();
        int squared = num*num;
        System.out.println("The square of "+num+" is: "+squared);

    }
}





/* Task 1. Write a program to get a number from user and print squre of given number
Task 2. Write a program to get principle, rate of interest and number of years from the user and calculate simple interest
Task 3.  Write a program to take total bill amount and discount percentage from user and print value of final bill amount after discount */