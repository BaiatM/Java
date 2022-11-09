package com.java.class17;
import java.util.Scanner;
public class NestedForLoopEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=1; i<=num;i++){
            for(int s=1;s<=num-i;s++){
                System.out.print(" ");
            }
            for(int a=1;a<=i;a++){
                System.out.print("A");
            }
            System.out.println();
        }

    }
}
