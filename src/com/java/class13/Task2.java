package com.java.class13;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("Please enter 2nd number");
        int num2 = sc.nextInt();
        System.out.println("Please enter 3rd number");
        int num3 = sc.nextInt();
        System.out.println("Please enter 4th number");
        int num4 = sc.nextInt();
        greatestNumber(num1,num2,num3,num4);

    }
    static int greatestNumber(int a, int b, int c, int d){
        if (a>b&&a>c&&a>d){
            System.out.println("The greatest number is "+a);
        }else if(b>c&&b>d){
            System.out.println("The greatest number is "+b);
        }else if(c>d){
            System.out.println("The greatest number is "+c);
        }else{
            System.out.println("The greatest number is "+d);
        }
        return a;
    }
}
//Write a program to find greatest number out of four numbers using the method