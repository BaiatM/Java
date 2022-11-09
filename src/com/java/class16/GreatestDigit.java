package com.java.class16;
import java.util.Scanner;
//find the length of the number
public class GreatestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int greatest = 0;
        while (num > 0) {
            if(num%10>greatest) {
                greatest = num % 10;
            }num = num / 10;
            }
        System.out.println(greatest);
        }

    }

