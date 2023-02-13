package com.maps_practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {
    public static void main(String[] args) {
        //HashMap is not synchronized -> 1 null key and multiple null values r allowed
        //HashTable is synchronized -> no null keys and no null values r allowed
        Map<String,Integer> marks = new HashMap<>();
        marks.put("Naveen",100);
        marks.put("Baiat",200);
        marks.put("Dan",400);
        marks.put("Tom",500);
        marks.put("Bob",600);
        marks.put("Peter",700);
        marks.put(null,800);
        System.out.println(marks);
        System.out.println(marks.size());
    }
}
