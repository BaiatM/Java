package com.java.class22;

public class Task3 {
    public static void main(String[] args) {
        int data[] = {23, 44, 21, 23, 23, 27, 35, 35, 75, 44, 35};
        System.out.print("Duplicate numbers: ");
        findDuplicate(data);
    }
    static void findDuplicate(int data[]){
        for(int i = 0; i <data.length; i++) {
            for (int j = i+1; j < data.length; j++) {
                if(data[i]==data[j]){
                    System.out.print(data[i]+" ");
                    break;
                }
            }
        }
    }
}

//Write a program to find all duplicates number from the array