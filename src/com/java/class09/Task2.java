package com.java.class09;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter how much power was consumed in units ");
        int power = sc.nextInt();
        if(power>0 && power<201){
            System.out.println("Total amount would be $"+(double)(power*0.5));
        }else if(power>200&&power<401){
            System.out.println("Total amount would be $"+(double)(power*0.65+100));
        }else if(power>400&&power<601){
            System.out.println("Total amount would be $"+(double)(power*0.8+230));
        }else{
            System.out.println("Please enter value between (0-600)");
        }

    }
}