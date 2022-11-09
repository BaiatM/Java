package com.java.class20;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter ur first and last name: ");
        String name = sc.nextLine();
        System.out.println(findInitials(name));
    }
    public static String findInitials(String name){
        name = name.toUpperCase();
        String initials = (name.charAt(0)+"."+name.charAt(name.indexOf(" ")+1)+".");
        return initials;
    }
    public static String findAllInitials(String name){
        for (int i = 0; i<name.length();i++) {
            if (name.charAt(i) == ' ') {
                System.out.print(name.charAt(0) + "." + name.charAt(i + 1));
            }
        }
        return name;
    }
}
