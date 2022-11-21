package com.java.class25;

public class Task1 {
    public static void main(String[] args) {
        HeadPhones airpods1 = new HeadPhones("Apple",5);
        HeadPhones airpods2 = new HeadPhones(259.55);
        HeadPhones airpods = new HeadPhones("red");

        System.out.println(airpods2.price);
        System.out.println(airpods1.version);
        System.out.println(airpods.color);
        airpods.version = 2;
        airpods.brand = "asdf";
        airpods.volumeUp(2);
    }
}
