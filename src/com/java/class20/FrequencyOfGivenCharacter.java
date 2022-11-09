package com.java.class20;
import java.util.Scanner;
public class FrequencyOfGivenCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter ur line here: ");
        String str = sc.nextLine();
        System.out.println("Please enter the character:");
        char target = sc.next().charAt(0);
        System.out.println("Frequency of "+target+ " is " +getNumbersOfChar(str));

    }

    static int getNumbersOfChar(String str) {
        int count = 0;
        char target= ' ';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }

        return count;
    }
}


