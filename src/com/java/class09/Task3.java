package com.java.class09;
import java.util.Scanner;
public class Task3 {
        public static void main(String[] args) {
            System.out.println("Please enter a number to count total number of minimum notes");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int notes500 = num/500;
            int notes100 = (num%500)/100;
            int notes20 = (num%100)/20;
            int notes10 = (num%20)/10;
            int notes5 = (num%10)/5;
            int notes2 = (num%5)/2;
            int notes1 = (num%2)/1;

            System.out.println("The number has "+ notes500 +" notes of 500");
            System.out.println("The number has "+ notes100 +" notes of 100");
            System.out.println("The number has "+ notes20 +" notes of 20");
            System.out.println("The number has "+ notes10 +" notes of 10");
            System.out.println("The number has "+ notes5 +" notes of 5");
            System.out.println("The number has "+ notes2 +" notes of 2");
            System.out.println("The number has "+ notes1 +" notes of 1");
                }
        }
/*Write a Program To Count Total Number Of Minimum Notes In Given Amount (Notes are of 1, 2, 5, 10, 20, 100 & 500)
Example
Input  : Amount = 255
Output : 2 Notes of 100
		 2 Notes of 20
		 1 Note of 10
                 1 Note of 5*/