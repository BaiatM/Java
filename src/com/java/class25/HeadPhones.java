package com.java.class25;

public class HeadPhones {
    String brand;
    String color;
    int version;
    String type;
    double price;
    int volume;

    HeadPhones(){
        System.out.println("Hello");
    }

    void volumeUp(int num){
            volume=volume+num;
            System.out.println("The volume is at "+ volume);
        }
    }

// Create your own class with your example and have properties and methods inside the class
// Create a MainClass with the main method and use your own class to create an object, and perform
// some operations (call methods of the class)