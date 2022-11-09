package com.java.class22;

public class FindIndexOfNumber {
    public static void main(String[] args) {
        int data[] = {12, 34, 56, 23, 76, 33, 74, 32, 21};
        System.out.println(findIndex(data, 76));
    }

    public static int findIndex(int[] data, int targetNumber) {
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == targetNumber) {
                index = i;
            }
        }return index;
    }
}


