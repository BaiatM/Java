package com.java.class09;
import java.util.Scanner;

public class InClassWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = sc.nextInt();
        System.out.println("Please enter your weight");
        int weight = sc.nextInt();
        if (age>=18) {
            if (weight > 50) {
                System.out.println("ur eligible");
            } else {
                System.out.println("ur underweight");
            }
        }else{
            if(weight>=50){
                System.out.println("ur too young to donate");
            }else{
                System.out.println("ur not eligible");
            }
            }
        }
    }

// 1. user has age more than or equal to 18 and weight more than equal to 50
// then they are eligible for blood donation
// 2. If user has age less than 18 and weight greater than 50 then
// print you're too young to donate blood
// 3. If user has age greater than 18 and weight less than 50 then
// print you're underweight. Please eat more and try again
// 4. If user has age less than 18 and weight less than 50 then
// print, you're not eligible