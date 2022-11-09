package com.java.class22;
//write a program to find a sum of elements stored in the array
public class Practice {
    public static void main(String[] args) {
        int result =0;
        int nums[] = {10,20,30,34,45,23,45,23};
        for(int i = 0; i<nums.length;i++){
            result = result+nums[i];
        }
        System.out.println(result);
    }
}
