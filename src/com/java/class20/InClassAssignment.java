package com.java.class20;
import java.util.Scanner;
public class InClassAssignment {
    public static void main(String[] args) {
        System.out.println("Please enter ur line here: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = getNumbersOfSpaces(str);

        if (a>10){
            System.out.println("large");
        }else if(a>=5){
            System.out.println("medium");
        }else{
            System.out.println("small");
        }
    }

    static int getNumbersOfSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        return count;
    }
}
