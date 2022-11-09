package com.java.class17;
import java.util.Scanner;
public class NestedForLoopExamples {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i < num/2+1; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print("A");
            }
            System.out.println();
        }
        for (int k = 1; k <= num/2+1; k++) {
            for (int c = k; c <= 5; c++) {
                System.out.print("A");
            }
            System.out.println();
        }
    }
}


