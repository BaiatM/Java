package com.java.class07;

import java.util.Scanner;

public class LadderExample02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your mark ");
        int mark = sc.nextInt();

        if (mark>= 100) {
            System.out.println("not valid");
        } else if (mark>90){
            System.out.println("your mark is A+");
        } else if (mark >=80) {
            System.out.println("your mark is A");
        } else if (mark >=70) {
            System.out.println("your mark is B+");
        } else if (mark >=60) {
            System.out.println("your mark is B");
        } else if (mark >=50) {
            System.out.println("your mark is C+");
        } else if (mark >=40) {
            System.out.println("your mark is C");
        } else if (mark < 40) {
            System.out.println("you fail the course");
        }
    }
    }

