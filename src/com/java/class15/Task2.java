package com.java.class15;

public class Task2 {
    public static void main(String[] args) {
        int i = 0;
        int result = 0;
        while (i<51){
            if(i%3==0||i%5==0){
                result = result+i;
            } i++;
        }
        System.out.println(result);
    }
}
//Java program to print the sum of 1 to 50 numbers which are divisible by 5 or by 3