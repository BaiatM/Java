package com.java.class18;
public class Task1 {
    public static void main(String[] args) {
        System.out.print("Prime numbers from 1 to 100 are: ");
        for (int i = 1; i <= 100; i++) {
            for (int j = 2; j <= i; j++) {
                if (j == i) {
                    System.out.print(i + " ");
                }
                if (i % j == 0) {
                    break;
                }
            }
        }
    }
}
//Write a program to print all the prime numbers from 1 to 100