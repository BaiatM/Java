package com.java.codingBat;

public class ex01 {
    public static void main(String[] args) {
        System.out.println(Close10(12,7));
        System.out.println(Math.abs(-123));
    }

    public static int Close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if (aDiff < bDiff) {
            return a;
        }
        if (bDiff < aDiff) {
            return b;
        }
        return 0;  // i.e. aDiff == bDiff

        // Solution notes: aDiff/bDiff local vars clean the code up a bit.
        // Could have "else" before the second if and the return 0.
    }
}
