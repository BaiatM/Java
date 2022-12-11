package com.java.class30;

public class Practice {
    public static void main(String[] args) {
        int N=9;
        int R=2;
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
