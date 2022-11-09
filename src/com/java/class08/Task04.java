package com.java.class08;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please any character to check if it's vowel or not");
        char ch = sc.next().charAt(0);
        if (ch=='a' ||ch=='e'||ch=='i'||ch=='o'|| ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("Character is vowel");
        }else if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
            System.out.println("Character is not vowel");
        }else{
            System.out.println("Please enter alphabetical letter");
        }
    }
}
/*Write a program to check given character is a vowel or not
Vowel characters are - a, e, i, o, u
Please refer to the below link to check how to get char using scanner class in java
Get Character In Java Using Scanner.
Example
Input - c
Output - Not Vowel
Input - a
Output - Vowel*/