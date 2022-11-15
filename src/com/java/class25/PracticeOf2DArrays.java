package com.java.class25;
import java.util.Scanner;
public class PracticeOf2DArrays {
    public static void main(String[] args) {

        String str = "today is cool day";
        String words []= str.split(" ");
        for (String word: words){
            System.out.println(word+"="+word.length());
        }
    }
}
//write the program length of each word from the string
//output
//Today - 5
//is -2
//Monday. - 7
//it - 2
//started -7
//well -4
//   for (int[] row : info) {
//            for (int column : row) {
//                System.out.print(column + " ");
//            }
//            System.out.println();
//        }