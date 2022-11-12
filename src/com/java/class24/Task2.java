package com.java.class24;

public class Task2 {
    public static void main(String[] args) {
        int info[][] = {
                {23, 44, 21},
                {45, 42, 31},
                {73, 14, 0}
        };
        for(int i=0;i<info.length;i++) {
            int result = 0;
            for (int j = 0; j < info.length; j++) {

                result = result + info[j][i];
            }
            System.out.println("sum of numbers: " + result);
        }
    }
}
//Write a program to print the sum of each COLUMN from a 2D array