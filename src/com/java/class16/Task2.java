package com.java.class16;

public class Task2 {
    public static void main(String[] args) {
        int sum=0;
        for(int i =10,b=1;i>5;i--) {
            b = 11 - i;
            sum = sum + i + b;
        }System.out.println(sum);
    }
}
//Java program to find result of 10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5
