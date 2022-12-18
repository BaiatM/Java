package com.java.class41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> listOfData = Arrays.asList(1,2,3,4,5,6,7,9);

        listOfData.add(123);
        listOfData.add(321);
        listOfData.add(234);
        listOfData.add(432);

        Integer a = 321;

        System.out.println(listOfData.size());

        System.out.println(listOfData);

        listOfData.remove(new Integer(123));
        listOfData.remove(a);

        System.out.println(listOfData);


        try{
            System.out.println(listOfData.get(5));


        }catch(Exception e){
            System.out.println("dude ur done");
        }
        int min = 0;
        int min1 =0;
        int minIndex = 0;
        for(int i = 0; i <listOfData.size();i++){
            min = listOfData.get(0);
            if(listOfData.get(i)<min){
                min = listOfData.get(i);
                minIndex = i;
            }
        }

    }
}
