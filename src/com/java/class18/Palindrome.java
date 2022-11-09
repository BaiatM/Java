package com.java.class18;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNumber = num;
        int rev=0;
        while(num!=0){
            int lastDigit = num%10;
            rev = rev*10+lastDigit;
            num=num/10;
        }

        if(originalNumber == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
