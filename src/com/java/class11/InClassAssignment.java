package com.java.class11;
import java.util.Scanner;

public class InClassAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int month = sc.nextInt();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 days");
            case 2 -> System.out.println("28 days");
            case 4, 6, 9, 11 -> System.out.println("30 days");
            default -> System.out.println("Please enter valid number (1-12)");
        }
    }
}
