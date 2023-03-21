package com.java.class22;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        //declaration of array - Declaration will not initialize size in memory
        int data[];
        int a; // 4 bytes

        data = new int[5];  //initializing array
        int array01 []  = new int[15];

        int num [] = new int [10]; // providing the length of the array

        int data1[] = new int[123]; // declaration and initialization in one line

        int numbers[] = {10,20,30,40,50,60,70,80,90,123,321}; //declaration and assignment in the same line

        System.out.println(data1.length);
        System.out.println(data1[2]); // printing value at particular index
        // default value for string is null for int is 0 for double is 0.0 for boolean is false


        System.out.println(Arrays.toString(numbers));
        System.out.println(data1[4]);//will give 0 by default
        System.out.println(numbers[8]);

        // simple index based for loop
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        // for each loop i useful for collections such asa maps, sets, list, arraylists
        for(int num123: numbers){
            System.out.println(num123);
        }


//printing 2D array
        int nums2d [][] = new int [1][2];
        int arr[][]={{1,2,3},{5,4,3},{123,321,123}};

        int arr1 [][] = {
                {1,2},
                {3,4},
                {5,6},
                {7,8}};

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int[][][] test = {
                {
                        {1, -2, 3},
                        {2, 3, 4}
                },
                {
                        {-4, -5, 6, 9},
                        {1},
                        {2, 3}
                }
        };

        // for..each loop to iterate through elements of 3d array
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.print(item);
                }
            }
        }
    }
}
//Arrays - container to hold more than one values of similar data types!