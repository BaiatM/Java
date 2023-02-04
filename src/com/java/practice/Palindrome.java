package com.java.practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int text;
        do{
            System.out.println("Write down the string so we can identify if its a palindrome or not");
            String check = sc.next();
            System.out.println(palindromeCheck(check));
            System.out.println("if u wanna do it again write 1, if not 0");
            text = sc.nextInt();
        }while(text==1);
    }
    public static String palindromeCheck(String check){
        String result="";
        String message="";
        for(int i=0;i<check.length();i++){
            result=result+check.charAt(check.length()-1-i);
        }
        if(result.equals(check)){
            message ="It is indeed a palindrome";
        }else{
            message ="Its not a palindrome u dumbass";
        }
        return message;
    }
}
