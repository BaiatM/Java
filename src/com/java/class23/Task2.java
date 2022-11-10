package com.java.class23;

public class Task2 {
    public static void main(String[] args) {
        int data[] = {5,2,12,6,234,6,7,8,9,0,15,24,43,8,7,3,6};
        int result[]= new int[500];
        for (int i =0; i<data.length;i++){
            result[data[i]]=data[i];
        }
        for(int num: result){
            if (!(num ==0)) {
                System.out.print(num + " ");
            }
        }
    }
}
//Program to sort the elements of an array in ascending order (Tricky, do enough brainstorming before solving)
//Example
//Input : 5, 2, 8, 7, 3, 6
//Output : Duplicate numbers - 2, 3, 5, 6, 7, 8