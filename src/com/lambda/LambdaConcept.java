package com.lambda;

public class LambdaConcept{
    public static void main(String[] args) {
        WebPage w1 = (name) -> {
                System.out.println("hello "+name);
        };
        w1.header("google");

        WebPage w2 = new WebPage() {
            @Override
            public void header(String value){
                System.out.println("hi "+value);
            }
        };
        w2.header("apple");

        WebPage w3 = (n)-> System.out.println(n.length());
        w3.header("asdfasdfasdfasdf");

        WebPage w4=(value -> System.out.println(value));
        w4.header("Lambda");
    }
}
