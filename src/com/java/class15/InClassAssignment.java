package com.java.class15;
import java.util.Scanner;
public class InClassAssignment {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        int result = 1;
        for(i=1; i<=num; i++)
            result= result* i;

        System.out.println(result);
        }
    }

