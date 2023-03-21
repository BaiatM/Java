package com.java.codingBat;

//1.Given a string, return a string length 1 from its front, unless front is false,
// in which case return a string length 1 from its back.
// The string will be non-empty.

//2. Given a string, return true if it ends in "ly".

public class StringLy {
    public static void main(String[] args) {
        String str1 = "oddly";
        String str2 = "oddy";
        String str3 = "odd";

        System.out.println(endsLy(str1));
        System.out.println(endsLy(str2));
        System.out.println(endsLy(str3));
        System.out.println("--------------");

        String str;
        str = "DEVXSCHOOL";
        System.out.println(str.substring(0, 4)); //returns the value starting at first number and ending on last one
        System.out.println(str.substring(1)); // returns the value that starts at the index number that we provide
        System.out.println("--------------");

        str1 = "Hello User, Welcome to Ebay";
        System.out.println(str1.substring(2,7));
        // result -> "llo U"

        str2 = "Welcome HOME!!!!";
        System.out.println(str2.substring(5, 6));
        // result?  "m"
    }


    public static boolean endsLy(String str){
        boolean res = false;
        // str.length()-2 ->
        if(str.substring(str.length()-2,str.length()).equals("ly")){ // ==
            res = true;
        }
        return res;
    }
    // 1 datatype = return type, 2 we can have any type of parameters
    // str = "DEVXSCHOOL";     DEVXS
    // str.substring(0,4); //returns the value starting att first number and ending on last one
    // str.substring(5)  result =?  str -> CHOOL

}

// how many data types in java?
// int, boolean, string, double, byte, short, float, long, char
