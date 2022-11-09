package com.java.class12;
import java.util.Scanner;
public class MethodExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printLineWithEqual(); // Method call
        System.out.println("Welcome to the Calculator");
        printLineWithEqual(); // Method call

        printLineWithHyphen(); // Method call
        System.out.println("Please enter first number");
        printLineWithHyphen(); // Method call
        int num1 = sc.nextInt();

        printLineWithHyphen(); // Method call
        System.out.println("Please enter second number");
        printLineWithHyphen(); // Method call
        int num2 = sc.nextInt();

        printLineWithEqual(); // Method call
        System.out.println("Here is your addition: "+(num1 + num2));
        printLineWithEqual(); // Method call
    }

    static void printLineWithEqual(){
        System.out.println("======================================");
    }

    static void printLineWithHyphen(){
        System.out.println("---------------------------------");
    }
}
/*User Defined Method - Reusable code, simplified code
Component of Method
1) Name of the Method
2) Arguments / Parameters to the Method
3) Method Return Type
4) Method Body*/