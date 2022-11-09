package com.java.class22;

public class Task1 {
    public static void main(String[] args) {
        int data[] = {23, 44, 21, 56, 27, 35, 75, 34, 25};
        sumOAndE(data);
    }
    static void sumOAndE(int data[]){
        int even = 0;
        int odd = 0;
        for(int i = 0; i <data.length; i++){
            if (data[i]%2==0){
                even=even+data[i];
            }else{
                odd=odd+data[i];
            }
        }System.out.println("sum of even: "+even+" , sum of odd: "+odd);
    }
}
//Write a program to find the sum of even and odd numbers