package com.java.class16;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int i = 0;
        while (i<num){
            if (num%10>0) {
                sum = sum + num % 10;
                num = num / 10;
            }
        }
        System.out.println(sum);
    }
}
//Write a program to print sum of each digits from the given number
