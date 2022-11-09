package com.java.class08;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your company rating ");
        int rating = sc.nextInt();
        if (rating==5){
            System.out.println("Your company rating is Very Good");
        }else if(rating==4){
            System.out.println("Your company rating is Good");
        }else if(rating==3){
            System.out.println("Your company rating is Average");
        }else if(rating==2){
            System.out.println("Your company rating is Poor");
        }else if(rating==1){
            System.out.println("Your company rating is Very Poor");
        }else{
            System.out.println("Please enter valid rating (1-5) ");
        }
    }
}
/*Write a program to print messages based on the rating of the company
For Example,
rating is 5 then print Very Good
rating is 4 then print Good
rating is 3 then print Average
rating is 2 then print Poor
rating is 1 then print Very Poor
Example
Input - 1
Output - Very Poor
Input - 4
Output - Good*/