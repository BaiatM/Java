package com.java.practice.phones;

public class Iphone8 extends Iphone {

    Iphone8(int batteryLevel, String messageText, boolean isLocked) {
        super(batteryLevel, messageText, isLocked);
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking using heartId");
    }
}
