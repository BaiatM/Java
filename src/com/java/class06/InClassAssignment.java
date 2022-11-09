package com.java.class06;
import java.util.Scanner;

public class InClassAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int a = sc.nextInt();

        int num1 = a * 12;
        System.out.println("u've wasted "+ num1 + "months already");
        int num2 = a*365;
        System.out.println("U've wasted "+ num2 +"days already");
        int num3 = num2*24;
        System.out.println("u've wasted "+ num3 +"hours already");




    }
}
