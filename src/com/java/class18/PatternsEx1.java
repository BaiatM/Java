package com.java.class18;

public class PatternsEx1 {
    public static void main(String[] args) {
        for(int i=1; i<6;i++){
            for(int j=6-i,b=6;j>0;j--){
                b--;
                System.out.print(b);
            }
            System.out.println( );
        }
    }
}
