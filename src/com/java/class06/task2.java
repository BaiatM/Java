package com.java.class06;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("To calculate your simple interest, you need to provide us 3 things");
        System.out.println("Please enter principle amount");
        double principle = scan.nextDouble();

        System.out.println("Now we need the rate of interest");
        double roi = scan.nextDouble();

        System.out.println("Finally, we need to know number of years");
        double years = scan.nextDouble();
        double si =principle*roi*years;

        System.out.println("Your Simple Interest is " + si);
    }
}




/*Task 2. Write a program to get principle, rate of interest and number of years from the user and calculate simple interest*/
