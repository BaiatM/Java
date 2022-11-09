package com.java.class18;

public class PatternsEx2 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            for (int a=1; a<=i-1; a++){
                System.out.print(" ");
            }
            for (int j=1, b=0; j<=11-2*i; j++){
                b++;
                System.out.print(b);
            }

            System.out.println();
        }
    }
}
