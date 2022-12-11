package com.java.class28;

public class HomeWork {
    static int count;
    HomeWork(){
        System.out.println("This is a constructor "+count);
        count++;
    }
}
class AnotherClass1 extends HomeWork{
    static String name;
    static int age;
}
class AndAnotherOne extends AnotherClass1{
    void someMethod(){
        System.out.println(name+" "+age);
    }
}
/*    Create three classes of your choice and have a parent-child relationship with them
      Create a Constructor, Variable, and Methods in each class
      Create a MainClass and access methods and variables of three classes in the main class */