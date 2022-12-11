package com.java.class28;

public class Task1ChildAndParent {
    public void mode(int a, int b){
        System.out.println(a%b);
    }
}
class Updated extends Task1ChildAndParent{
    public void toThePower(int a, int b){
        int result =1;
        for(int i=0;i<b;i++){
            result = result*a;
        }
        System.out.println(result);
    }
}
