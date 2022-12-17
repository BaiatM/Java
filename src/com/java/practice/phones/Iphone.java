package com.java.practice.phones;

import com.java.practice.Charger;
import com.java.practice.LockOrUnlock;
import com.java.practice.Messenger;

public abstract class Iphone implements LockOrUnlock, Charger, Messenger {
    private int batteryLevel;
    private String messageText;
    private boolean isLocked;

    Iphone(int batteryLevel,String messageText,boolean isLocked){
        this.batteryLevel = batteryLevel;
        this.messageText = messageText;
        this.isLocked = isLocked;
    }

    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    @Override
    public void chargeBattery() {
        batteryLevel++;
    }

    @Override
    public void sendMessage(String text) {
        messageText = text;
    }

    @Override
    public void readMessage() {
        System.out.println(messageText);
    }
    @Override
    public void lock() {
        System.out.println("Locking using one button ");
    }

}
