package com.java.class21;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a line to identify vowels and consonants: ");
        String str1 = sc.nextLine();
        int vowels = 0;
        int consonants = 0;
        for (int i=str1.length()-1; i>=0; i--){
            if(str1.charAt(i)=='a'||str1.charAt(i)=='o'||str1.charAt(i)=='u'||str1.charAt(i)=='e'||str1.charAt(i)=='i'){
                vowels++;
            }else{
                consonants++;
            }
        }
        System.out.println("Vowels: "+vowels+" Consonants: "+consonants);
    }
}


//Java Program to count the total number of vowels and consonants in a string