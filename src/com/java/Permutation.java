package com.java;

import java.util.Scanner;

public class Permutation {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to Permutation program");
            System.out.println("Do you wanna find a Permutation for N and R, where N is total number of objects and R is number of objects selected ? (yes/no)");
            String trueOrFalse = sc.next();
            String restart;
            do {
                if (trueOrFalse.equalsIgnoreCase("yes")) {
                    System.out.println("Please provide ur N: ");
                    int N = sc.nextInt();
                    System.out.println("Please provide ur R: ");
                    int R = sc.nextInt();
                    System.out.println("Last question, do u want with or without repetition? (with/without)");
                    String repetition = sc.next();
                    if (repetition.equalsIgnoreCase("with")) {
                        permutation(N, R);
                    } else {
                        permutation1(N, R);
                    }
                } else {
                    System.out.println("maybe next time!");
                }
                System.out.println("Do u wanna try again with different numbers? (yes/no)");
                restart = sc.next();

            } while (restart.equalsIgnoreCase("yes"));


        }
        public static void permutation(int N, int R) {
            int result = 1;
            for(int i=0;i<R;i++){
                result = result * N;
            }
            System.out.println(result);
        }
        public static void permutation1(int N, int R) {
            int result1 = N;
            int result2 = N-R;
            for(int i=N-1;i>0;i--){
                result1 = result1*i;
            }
            for(int i=result2-1;i>0;i--){
                result2 = result2*i;
            }
            System.out.println(result1/result2);
        }


}
