package com.java.class13;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Please enter a temperature in celsius to convert into Fahrenheit");
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        fahrenheitConversion(temp);
    }

    static double fahrenheitConversion(double a) {
        System.out.println(a * 9 / 5 + 32);
        return a;
    }
}
