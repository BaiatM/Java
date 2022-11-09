package com.java.class18;

public class PatternsEx3 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int s=1;s<=5-i;s++){
                System.out.print(" ");
            }
            for(int a=1;a<=i*2-1;a++){
                System.out.print(i%2);
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++){
            for(int s=1;s<=i;s++){
                System.out.print(" ");
            }
            for(int a=1;a<=9-i*2;a++){
                System.out.print((i+1)%2);
            }
            System.out.println();
        }
    }
}
