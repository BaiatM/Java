package com.java.class36;

// we have to use implements for a class that extending "interface",
// we have to use extends for an interface that inherits from another interface

public class Subclass implements FirstInterface {
    // we must override the abstract method from interface, all method overriding rules apply
    public void play(){
        System.out.println("Play");
    }
}
