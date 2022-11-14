package com.java.class24;

public class Task3 {
    public static void main(String[] args) {
        int data[] = {13,20,8,6,3,5,2,4,1,};
        int result[]= new int[21];
        for (int i = 0; i<data.length;i++){
            result[data[i]]=data[i];
        }
        for(int num: result) {
            if (!(num == 0)) {
                System.out.print(num + " ");
            }
        }
    }
}

