package com.java.mentoring;

import java.util.Scanner;

public class ExceptionPraactice {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt(),num1 = sc.nextInt();
        }catch(Throwable e){
            System.out.println("fuck off");
        }
    }
}
