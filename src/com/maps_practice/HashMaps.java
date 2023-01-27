package com.maps_practice;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        // HashMap is a class implements Map interface
        // extends AbstractMap
        // it contains only unique elements
        // stores the values - key - value pair
        // it may have one null key and multiple null values
        // it maintains no order
        // HashMap is non-synchronized

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1,"Selenium");
        hm.put(2,"QTP");
        hm.put(3,"TestComplete");
        hm.put(4,"RFT");

        //to get specific value
        System.out.println(hm.get(1));
        System.out.println(hm.get(5));

        //to print everything
        System.out.println(hm);
        //another way
        for(Map.Entry m: hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        // how to remove element
        System.out.println(hm);
        hm.remove(3);
        System.out.println(hm);

        //
        HashMap<Integer,Employee> emp = new HashMap<>();
        Employee e1 = new Employee("Josh", 26,"QA");
        Employee e2 = new Employee("Dan", 27,"Dev");
        Employee e3 = new Employee("Ben", 29,"DevOps");

        emp.put(1,e1);
        emp.put(2,e2);
        emp.put(3,e3);

        System.out.println(emp);
        //traverse the hashmap
        for(Map.Entry<Integer,Employee> m: emp.entrySet()){
            int key = m.getKey();
            Employee e = m.getValue();
            System.out.println(key+" Info");
            System.out.println(e.name+" "+e.age+" "+e.dept);
            System.out.println(m.getValue().age);
        }


    }
}
