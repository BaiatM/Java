package com.java.class22;

public class Task2 {
    public static void main(String[] args) {
        int data[] = {23, 44, 21, 56, 27, 35, 75, 34, 25};
        greatestNum(data);
    }
    static void greatestNum(int data[]){
        int greatestNum = 0;
        for(int i = 0; i <data.length; i++){
            if(data[i]>greatestNum){
                greatestNum = data[i];
            }
        }
        System.out.println("greatest number is: " +greatestNum);
    }
}


//Write a program to find the greatest number from an array