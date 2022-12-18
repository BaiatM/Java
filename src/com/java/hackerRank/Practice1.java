package com.java.hackerRank;
import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        double d=scan.nextDouble();
//        scan.nextLine();
//        String s = scan.next();
//
//        // Write your code here.
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);

        System.out.println(in1To10(12,false));
    }
    public static boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            if(n <= 1 || n >= 10){
                return true;
            }
        } else {
            if(n >= 1 && n <= 10){
                return true;
            }
        }
        return false;
    }


}
