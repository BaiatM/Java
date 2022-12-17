package com.java.practice.phones;

public class Iphone7 extends Iphone {

    Iphone7(int batteryLevel, String messageText, boolean isLocked) {
        super(batteryLevel, messageText, isLocked);
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking using touchId");
    }
}
