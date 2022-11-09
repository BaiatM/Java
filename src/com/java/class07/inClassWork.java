package com.java.class07;
import java.util.Scanner;

public class inClassWork {
    public static void main(String[] args) {

        Scanner jarvis = new Scanner(System.in);
        System.out.println("enter ur age please");
        int a = jarvis.nextInt();
        if (a>16) {
            System.out.println("You are eligible to obtain a Driving License ");
        } else {
            System.out.println("You are still a kid");
        }
    }
}
