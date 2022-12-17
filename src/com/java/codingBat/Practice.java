package com.java.codingBat;

public class Practice {
    public static void main(String[] args) {

        String x = "asxdfxxfds";
        boolean result=false;
        int indexOfStr = x.indexOf("x");
        int secondIndexOfStr = indexOfStr + 1;
        if (x.charAt(indexOfStr)==x.charAt(secondIndexOfStr)){
            result = true;
        }
        System.out.println(result);
        //boolean doubleX(String str) {
        //  boolean result = false;
        //  if(str.contains("x")&&str.length()>str.indexOf("x")+1){
        //   int indexOfStr = str.indexOf("x");
        //   int secondIndexOfStr = indexOfStr + 1;
        //   if (str.charAt(indexOfStr)==str.charAt(secondIndexOfStr)){
        //            result = true;
        //        }
        //}
        //  return result;
        //}

    }
}

//Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
//
//
//doubleX("axxbb") → true
//doubleX("axaxax") → false
//doubleX("xxxxx") → true
