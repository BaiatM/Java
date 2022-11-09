package com.java.class08;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your total amount of bill ");
        double bill = sc.nextDouble();
        if (bill >= 10000){
            System.out.println("Here is your final bill $" + bill*0.8);
        }else if(bill>=5000){
            System.out.println("Here is your final bill $" + bill*0.85);
        }else if(bill>=2000){
            System.out.println("Here is your final bill $" + bill*0.9);
        }else if(bill>=1000) {
            System.out.println("Here is your final bill $" + bill * 0.95);
        }else if(bill>=0){
            System.out.println("Unfortunately there is no discount ");
        }else{
            System.out.println("Please enter a valid bill amount");
        }
        System.out.println();
    }
}
/*Write a program to calculate the final bill of the customer after giving an appropriate discount based on the amount as follow
If total amount equal or above 10000 then give 20% discount
If total amount equal or above 5000 then give 15% discount
If total amount equal of above 2000 then given 10% discount
If total amount equal of above 1000 then given 5% discount
If total amount less than 1000 then 0% discount
Example
Input - 2500
Output - Bill after discount : 2250
Input - 500
Output - Bill after discount : 500
*/