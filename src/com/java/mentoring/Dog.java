/*
                                        Object in Java
    It is a basic unit of Object-Oriented Programming and represents real life entities.
    A typical Java program creates many objects, which as you know, interact by invoking methods.
    An object consists of 3 components:

    Identity: It gives a unique name to an object and enables one object to interact with other objects.
    State: It is represented by attributes of an object. It also reflects the properties of an object.
    Behavior: It is represented by methods of an object. It also reflects the response of an object with other objects.

    Example of an object: dog

    Identity: Billi
    State:    white, black
    Behavior: run, bite, bark

    Objects correspond to things found in the real world. For example, a graphics program may have objects such as
    “circle”, “square”, and “menu”. An online shopping system might have objects such as “shopping cart”, “customer”, and “product”.
 */
















package com.java.mentoring;
    // Class Declaration
    // The class declaration component declares the name of the class along with other attributes such as the class's superclass,
    // and whether the class is public, final, or abstract.
    public class Dog {
        // Instance Variables
        String name;
        String breed;
        int age;
        String color;

        // Constructor Declaration of Class
        Dog(String name){
            this.name = name;
        }
        Dog(String name, String breed, int age, String color){
            this.name = name; //?
            this.breed = breed;
            this.age = age;
            this.color = color;
        }


        public String toString() {
            return("Hi my name is "+ name +
                    "\nMy breed is " + breed +
                    "\nI am " + age + " years old" +
                    "\nMy color is " + color);
        }


        public static void main(String[] args) {
            // creating "dog1" object
            Dog dog1234 = new Dog("asdf");

            Dog dog123 = new Dog("Billi");

            Dog dog1 = new Dog("Cerberus","papillon", 5, "white");
            System.out.println(dog1.toString());
            // creating "dog2" object

        }

       // public Object clone(String asdf, String fda, int i, String fdas) {
       //     return null;
       // }
    }





    /*
                     Ways to create an object of a class
    There are four ways to create objects in java. Strictly speaking there is only one way (by using new keyword),
    and the rest internally use "new" keyword.

    1) Using "new" keyword: It is the most common and general way to create an object in java. Example:

    // creating object of class Test:
    Test t = new Test();

    2) Using Class.forName(String className) method: There is a pre-defined class in java.lang package with name Class.
    The forName(String className) method returns the Class object associated with the class with the given string name.
    We have to give a fully qualified name for a class. On calling new Instance() method on this Class object returns
    new instance of the class with the given string name.
    // creating object of public class Test
    // consider class Test present in com.p1 package
    Test obj = (Test)Class.forName("com.p1.Test").newInstance();

    3) Using clone() method: clone() method is present in Object class. It creates and returns a copy of the object.
    // creating object of class Test:
    Test t1 = new Test();
    // creating clone of above object:
    Test t2 = (Test)t1.clone();

    4) Deserialization: De-serialization is a technique of reading an object from the saved state in a file.
    FileInputStream file = new FileInputStream(filename);
    ObjectInputStream in = new ObjectInputStream(file);
    Object obj = in.readObject();
     */
