package com.java.class34;
public class BaseIphone {
    //Whenever you are creating Iphone ask the user to input
    // model, color, iOSVersion in the constructor
    //when creating concrete Iphone like Iphone7 and iphone8 etc.
    // you should ask the user to input model into constructor

    private String model;
    private int memoryInMG;
    private String color;
    private String iOSVersion;


    public BaseIphone(String model, int memoryInMG, String color, String iOSVersion) {
        this.model = model;
        this.memoryInMG = memoryInMG;
        this.color = color;
        this.iOSVersion = iOSVersion;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemoryInMG() {
        return memoryInMG;
    }

    public void setMemoryInMG(int memoryInMG) {
        this.memoryInMG = memoryInMG;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIOSVersion() {
        return iOSVersion;
    }

    public void setIOSVersion(String iOSVersion) {
        this.iOSVersion = iOSVersion;
    }


    public String writeAMessage(String message){
        return message;

    }
    public String writeANote(String note) {
        return note;


    }
    public String whichIphone(BaseIphone baseIphone){
        baseIphone.getColor();
        baseIphone.getIOSVersion();
        baseIphone.getModel();
        baseIphone.getMemoryInMG();

        return baseIphone.getModel() + " "+ baseIphone.getColor() +" "+ baseIphone.getIOSVersion() + " "+baseIphone.getMemoryInMG();
    }


}
