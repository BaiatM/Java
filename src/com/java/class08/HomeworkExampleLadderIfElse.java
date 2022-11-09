package com.java.class08;
import java.util.Scanner;

public class HomeworkExampleLadderIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter ur mark");
        int mark = sc.nextInt();
        if(mark > 100) {
            System.out.println("please enter valid mark (0-100)");
        }else if(mark<0){
            System.out.println("please enter valid mark (0-100)");
        }else if(mark>=90){
            System.out.println("A+");
        }else if(mark>=80){
            System.out.println("A");
        }else if(mark>=70){
            System.out.println("B+");
        }else if(mark>=60){
            System.out.println("B");
        }else if(mark>=50){
            System.out.println("C+");
        }else if(mark>=40){
            System.out.println("C");
        }else if(mark<40){
            System.out.println("Fail");
        }
        }
    }

