package com.java.mentoring;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectPractice {
    //2nd way
    Dog dog1 = (Dog)Class.forName("com.java.mentoring.Dog").newInstance();

    //3rd way
    Dog t1 = new Dog("asdf","asdfd",53,"fda");
//   Dog t2 = (Dog)t1.clone("asdf","fda",23,"fdas");

    //4th way
    private String dog3;
    FileInputStream file = new FileInputStream(dog3);
    ObjectInputStream in = new ObjectInputStream(file);
    Object dog2 = in.readObject();

    public ObjectPractice() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
    }
}
