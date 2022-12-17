package com.java.class34;
import javax.management.StringValueExp;
import java.util.Arrays;

public class TestApple {
    public static void main(String[] args) {
        BaseIphone deviceId1 = new BaseIphone("Iphone7", 512, "Black", "16.0");
        BaseIphone deviceId2 = new BaseIphone("Iphone8", 256, "Silver", "14.0");
        BaseIphone deviceId3 = new BaseIphone("Iphone10", 156, "matte", "15.0");
        BaseIphone deviceId4 = new BaseIphone("Iphone8", 156, "Matte", "15.0");



        BaseIphone[] allIphones = new BaseIphone[4];
        allIphones[0] = deviceId1;
        allIphones[1] = deviceId2;
        allIphones[2] = deviceId3;
        allIphones[3] = deviceId4;


        updateIOS(allIphones);
        System.out.println(Arrays.toString(Arrays.toString(allIphones).toCharArray()));
        updateasdf(allIphones);
    }
    //    create a static method that takes an array of all types of Iphones and finds all iphones
    //    with an IOSversion that is not 16.0 and updates them to 16.0
    public static void updateIOS(BaseIphone[] deviceId1) {
        for(int i=0;i<deviceId1.length;i++){
            if(!deviceId1[i].getIOSVersion().equals("16.0")){ // deviceId1.getIOSVersion()
                deviceId1[i].setIOSVersion("16.0");
            }
        }
    }
    public static void updateasdf(BaseIphone[] device1) {
        for(int i=0;i<device1.length;i++){
            if(device1[i].getColor().equals("Black")){ // getcolor of each object
                device1[i].setColor("white"); // setcolor "white"
            }
        }
    }
}
