package com.java.class23;

public class PracticeFor2DArray {
    public static void main(String[] args) {
        //declaration of 2d array
        int data[][];

        //declaration and initialization of 2d array
        int nums[][] = new int[3][3];

        //declare and assign in one line
        int info[][] ={{23,32,4}, {123,321,2}, {412,321,2}};

        //find the number of rows in the array
        System.out.println(nums.length);//will give total number of rows

        //find number of column in a row
        System.out.println(nums[0].length);

        //print data at particular index
        System.out.println(info[1][1]);

        for(int i =0;i<info.length;i++){
            for(int j=0; j<info[i].length;j++){
                System.out.print(info[i][j]+" ");
            }
            System.out.println();
        }

    }

}
