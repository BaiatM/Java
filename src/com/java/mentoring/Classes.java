/*
                                        Class in Java
    1. Class is a set of object which shares common characteristics/behavior and common properties/attributes.
    2. Class is not a real world entity. It is just a template or blueprint or prototype from which objects are created.
    3. Class does not occupy memory.
    4. Class is a group of variables of different data types and group of methods.

    A class in java can contain:
    • data member
    • method
    • constructor
    • nested class and
    • interface

Syntax to declare a class:

access_modifier
class <class_name>  {
    data member; (The variables declared inside the class are known as data members)
    method;
    constructor;
    nested class;
    interface; (An abstract type that is used to describe a behavior that classes must implement)
}

*/













package com.java.mentoring;

class Classes {
    int id;//instance variable (also data member)
    String name; //instance variable (also data member)

    public static void main(String[] args) {
        Classes s1 = new Classes();//creating an object of Student
        System.out.println(s1.id);
        System.out.println(s1.name);

        for(int i=0;i<3;i++){
            for(int j =1;j<4;j++){
                i = i%j;
                System.out.println(j);
            }

        }
        int a=10;
        double d=a;
        d=a+10;
        a=(int)d+a;


    }

}




/*      The Final definition of Classes
     A class is a user defined blueprint or prototype from which objects are created. It represents the set of properties or
     methods that are common to all objects of one type.

     In general, class declarations can include these components, in order:
    -Modifiers: A class can be public or has default access.
    -"Class" keyword: class keyword is used to create a class.
    -Class name: The name should begin with an initial letter (capitalized by convention, i.e. Upper CamalCase).
    -Superclass(if any): The name of the class’s parent (superclass), if any, preceded by the keyword "extends".
     A class can only extend (subclass) one parent.
    -Interfaces(if any): A comma-separated list of interfaces implemented by the class, preceded by the keyword implements.
     A class can implement more than one interface.
    -Body: The class body is surrounded by braces, { }.

    Def:
    Constructors are used for initializing new objects.
    Fields are variables that provide the state of the class and its objects.
    Methods are used to implement the behavior of the class and its objects.
    There are various types of classes that are used in real time applications such as nested classes,
    anonymous classes, lambda expressions.
 */