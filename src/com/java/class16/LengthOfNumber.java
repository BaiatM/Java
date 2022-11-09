package com.java.class16;
import java.util.Scanner;
public class LengthOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int result =0;
        while(i>0){
            result++;
            i=i/10;
        }
        System.out.println(result);
    }
}
