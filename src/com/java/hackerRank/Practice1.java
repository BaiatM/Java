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
        System.out.println(lessBy10(11,1,23));
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
    public static boolean lessBy10(int a, int b, int c) {
        return (Math.abs(a - b) >= 10 ||
                Math.abs(b - c) >= 10 ||
                Math.abs(a - c) >= 10);

        // Solution notes: it's a bit surprising that this can be so short.
        // We simplify by using Math.abs() to take the absolute value --
        // say with the ab pair, one is smaller and one is bigger, but we don't
        // care which is which, since we are just looking for a difference
        // of 10 or more.
    }



}
