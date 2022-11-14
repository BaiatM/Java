package com.java.class24;

public class Task1 {
    public static void main(String[] args) {
        int data[] = { 23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35};
        int duplicates[] = new int[data.length];
        for(int i =0, count=0; i<data.length-1;i++){
            for(int j=i+1; j<data.length;j++){
                if (data[i]==data[j]){
                    if(!isElementPresentInArray(duplicates, data[i])) {
                        System.out.print(data[i] + " ");
                        duplicates[count]=data[i];
                        count++;
                    }
                }
            }
        }

    }
    static boolean isElementPresentInArray (int duplicates[], int targetNumber){
        for(int num: duplicates){
            if(num == targetNumber){
                return true;
            }
        }
        return false;
    }
}
//Write a program to find all duplicate number from the array (Implement this program to get unique numbers in the output)