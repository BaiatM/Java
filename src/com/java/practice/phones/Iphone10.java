package com.java.practice.phones;

public class Iphone10 extends Iphone {

    Iphone10(int batteryLevel, String messageText, boolean isLocked) {
        super(batteryLevel, messageText, isLocked);
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking using faceId");
    }
}
