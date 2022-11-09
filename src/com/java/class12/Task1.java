package com.java.class12;
//Write a program to check given number is odd or even using function
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Please enter a number to identify if its Odd or Even");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        OddEven(num);

    }
    static void OddEven (int a){
        if (a%2==0){
            System.out.println("The number is Even");
        }else{
            System.out.println("The number is Odd");
        }
    }
}
