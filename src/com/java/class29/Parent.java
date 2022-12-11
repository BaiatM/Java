package com.java.class29;

public class Parent {
    static int count;
    Parent(){
        this(76);
        System.out.println("my boy "+count);
        count++;
    }
    Parent(int a){
        System.out.println("my grandchild's age is "+a);
    }
}
class Child extends Parent{
    Child(){
        this('!');
        System.out.println("DAD! "+count);
        count++;
    }
    Child(char a){
        super();
        System.out.println("I wasted "+a+" much time cuz of u");
    }
}
class GrandChild extends Child{
    GrandChild(){
        this("PLEASE");
        System.out.println("Grandpa! "+count);
        count++;
    }
    GrandChild(String s){
        super();
        System.out.println("Lord gimme patience "+s);
    }
}
//Create three classes of your choice and have a parent-child relationship with them
//Create three types of Constructor in Parent class and child class both (Total six Constructor)
//Create a MainClass and create six different object using each Constructor, check the output
//Call Constructor  internally using this and super keyword, and check the output, do more brainstorming by changing different statement