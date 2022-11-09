package com.java.class21;
import java.util.Scanner;
public class FindReverseOfStringApproach2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        String storage = "";
        char ch;

        for (int i = 0; i < name.length(); i++) {
            ch = name.charAt(i);
            storage = ch + storage;

        }
        System.out.println("Reverse of your name is " + storage);
    }
}
