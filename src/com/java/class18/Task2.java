package com.java.class18;

public class Task2 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
                if(i%5==4&&i%4==3&&i%3==2){
                    System.out.println("The magic number is "+i);
            }
        }
    }
}
//Write a program to find a magic number from 1 to 100,
//if you divide that number by 5 you will get reminder 4
//if you divide that number by 4 you will get reminder 3
//if you divide that number by 3 you will get reminder 2
//if you divide that number by 2 you will get reminder 1