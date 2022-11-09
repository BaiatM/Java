package com.java.class09;
import java.util.Scanner;
//get salary and age from the user
//1. if age is less than 18 then just print ur not eligible
//2, if age is more than or equal to 18 and salary is less than 5000 then print "sorry u have to work hard to get credit card"
//3. if age is more than or equal to 18 and salary is greater than 5000, print "u r eligible"
//4. if age is more than or equal to 18 and salary is greater than or equal to 20000, print "ull get free credit card"
public class NestedIfExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age ");
        int age = sc.nextInt();


        if(age>=18) {
            System.out.println("Please enter your salary ");
            int salary = sc.nextInt();
            if (salary >= 20000) {
                System.out.println("you will get free credit card");
            }else if(salary >= 5000){
                System.out.println("you are eligible");
            } else {
                System.out.println("sorry you have to work hard to get a credit card");
            }
        }else{
            System.out.println("you are not eligible for credit card");
        }
    }
}
