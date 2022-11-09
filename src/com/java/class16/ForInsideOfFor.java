package com.java.class16;

public class ForInsideOfFor {
    public static void main(String[] args) {
        int a = 6*16;
        for(int i=8; i<=13; i++){//6
            for(int j=0; j<=15;j++)//16
            System.out.println("Baiat"+""+j);

        }
        System.out.println(a);
    }
}
