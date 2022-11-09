package com.java.class21;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your line here: ");
        String space = " ";
        String nothing = "";
        String str1 = sc.nextLine().toLowerCase().replaceAll(space,nothing);
        String storage = "";
        char ch;
        for (int i=str1.length()-1;i>=0;i--){
            storage = storage +str1.charAt(i);
        }
        if(str1.equals(storage)){
            System.out.println("ur text is Palindrome");
        }else{
            System.out.println("ur text is not a Palindrome");
        }
    }
}
//Java Program to determine whether a given string is palindrome or not by ignoring the case of characters and white spaces