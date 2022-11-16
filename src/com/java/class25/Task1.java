package com.java.class25;

public class Task1 {
    public static void main(String[] args) {
        HeadPhones airpods = new HeadPhones();
        airpods.brand = "Apple";
        airpods.color = "white";
        airpods.version = 2;
        airpods.type = "wireless";
        airpods.price = 159.99;
        airpods.volume = 2;
        System.out.println("I bought headphones a year ago, the brand of it is "+airpods.brand);
        System.out.println("The color was "+airpods.color);
        System.out.println("at that time, the latest version was "+airpods.version);
        System.out.println("for certain it is "+airpods.type);
        System.out.println("the price was "+airpods.price);
        airpods.volumeUp(7);


    }
}
