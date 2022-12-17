package com.java.class34;
public class TouchIDIphone extends BaseIphone {

    public TouchIDIphone(String model, int memoryInMG, String color, String iOSVersion) {
        super(model, memoryInMG, color, iOSVersion);
    }
    String fingerPrintData []={"text1", "text2","text3"};
    public boolean getUserTouchId(String fingerPrint) {
        boolean isUnlock=false;
        for (int i=0; i<fingerPrintData.length;i++){
            if (fingerPrint.equalsIgnoreCase(fingerPrintData[i])){
                isUnlock=true;
            }
        }
        return isUnlock;
    }
}