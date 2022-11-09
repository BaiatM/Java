package com.java.class10;
import java.util.Scanner;
public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = num/100;
        int b = (num%100)/10;
        int c = num%10;
        if (num>99&&num<1000){
            System.out.println(c+""+b+""+a);
        }else{
            System.out.println("The number is not valid");
        }
    }
}
