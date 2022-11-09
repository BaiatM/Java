package com.java.class15;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Please enter a number to get a reverse if it");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num!=0){
            System.out.println(num%10);
            num = num/10;
        }
    }
}
//Write a program to print each digit of the number into a separate line in reverse order