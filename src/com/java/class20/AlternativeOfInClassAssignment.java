package com.java.class20;
import java.util.Scanner;
public class AlternativeOfInClassAssignment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String :");
        String userString = scan.nextLine();

        System.out.println(sizeOfString(getNumberOfSpaces(userString)));

    }
    public static int getNumberOfSpaces (String str){

        int count = 0;
        for (int i = 0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }
    public static String sizeOfString (int num){

        String size = "";
        if(num < 5){
            size = "Small";
        }else if(num >= 5 && num <= 10){
            size = "Medium";
        }else {
            size = "Large";
        }
        return size;
    }
}

