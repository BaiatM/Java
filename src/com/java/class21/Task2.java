package com.java.class21;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your line here: ");
        String str1 = sc.nextLine();
        String space = " ";
        String nothing = "";
        System.out.println(str1.replaceAll(space,nothing));
            }
        }
//Java Program to remove all the white spaces from a string