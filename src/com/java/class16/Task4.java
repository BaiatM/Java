package com.java.class16;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=1,factors =1;i<num;i++){
            if(num%i==0){
                factors =i;
                System.out.print(factors+" ");
            }
        }
    }
}
//Write a program to find factors of the given number
//Input - 6
//Output - 1 2 3 6