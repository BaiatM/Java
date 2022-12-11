package com.java.class28;

public class Vehicle {
    Vehicle(){
        System.out.println("from vehicle");
    }
}
class Car extends Vehicle{
    Car(){
        System.out.println("from car");
    }
}
class SportsCar extends Car{
    SportsCar(){
        System.out.println("from Sportscar");
    }
}