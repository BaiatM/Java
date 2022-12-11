package com.java.class30;

public class CodingBat {
    public static void main(String[] args) {
        notString("candy");
    }
    public static String notString(String str) {
        String result="";
        if(str.substring(0,3).equals("not")){
            result = str;
        }else if(!(str.length() >3)){
            result = "not "+str;
        }else{
            result = "not "+str;
        }
        return result;
    }

}
