package com.java.codingBat;

public class Practice02 {
    public static void main(String[] args) {
        System.out.println(stringX("xfuxcxkxixnxgxaxwxexsxoxmxex"));

    }
    public static String stringX(String str) {
        String result = "";
        if(str.length()>0&&str.charAt(0)=='x'){
            result = "x";
        }
        for(int i =0; i<str.length();i++){
            if(str.charAt(i)=='x'){
                result=result;
            }else{
                result = result+str.charAt(i);
            }
        }
        if(str.length()>1&&str.charAt(str.length()-1)=='x'){
            result = result + "x";
        }
        return result;
    }

}
