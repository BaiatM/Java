package com.java.class23;

public class Practice {
    public static void main(String[] args) {
        int data[] = {23,44,21,23,23,35,35,44,35};
        //printing all elements if array using index based for loop
        //iterating, traversing
        for (int i = 0; i<data.length;i++){

        }
        // print all elements of array using for each loop/ enhance for loop
        int sum= 0;
        for( int num    :  data   ){
            num = num*2;
            sum+=num;
        }
        System.out.println(sum);
    }
}
