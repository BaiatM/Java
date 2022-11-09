package com.java.class17;

public class NestedForLoopEx3 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            for (int j = 6 - i; j <= 5; j++) {
                String a = " ";
                System.out.print(a + "a");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=6-i;j<=5;j++){
                System.out.print("A");
            }
            System.out.println();
        }
    }
}
