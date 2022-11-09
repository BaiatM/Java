package com.java.class06;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
        System.out.println("Enter your total bill amount here");
        double bill = scan.nextDouble();

        System.out.println("Enter discount percentage");
        double discount = scan.nextDouble();

        double FinalBill = bill-(bill*discount/100);
        System.out.println("The final bill is "+FinalBill);

    }
}


//Write a program to take total bill amount and discount percentage from user and print value of final bill amount after discount