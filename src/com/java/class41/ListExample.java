package com.java.class41;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> listOfData = new ArrayList<Integer>();
        listOfData.add(123);
        listOfData.add(123);
        listOfData.add(123);
        listOfData.add(321);
        listOfData.add(234);
        listOfData.add(432);

        System.out.println(listOfData.size());

        System.out.println(listOfData);

        listOfData.remove(new Integer(123));

        System.out.println(listOfData);


        try{
            System.out.println(listOfData.get(5));


        }catch(Exception e){
            System.out.println("dude ur done");
        }


    }
}
