package com.java.class06;

public class casting {
    public static void main(String []args){
        int a=10, b=20;
        int result;
        result = a / b * a;
        a = a * b;
        b = a * b;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}
