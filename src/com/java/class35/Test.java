package com.java.class35;

public class Test {
    public static void main(String[] args) {
        BasePatient g = new GeneralPatient();
        BasePatient c = new ChildPatients();
        BasePatient s = new SeniorPatients();
        BasePatient d = new DisabledPatients();



        System.out.println("For general patients ");
        g.takeTylenol();
        System.out.println("For child patients ");
        c.takeTylenol();
        System.out.println("For senior patients ");
        s.takeTylenol();
        System.out.println("For disabled patients ");
        d.takeTylenol();

        g.chargePatient(200,20);
        System.out.println(g.payment);
        c.chargePatient(200,50);
        System.out.println(c.payment);
        s.chargePatient(200,35);
        System.out.println(s.payment);
        d.chargePatient(200,23);
        System.out.println(d.payment);
    }
}
//abstract classes can not be instantiated, initialized directly
//this is good for cases like BaseIphone vs concrete Iphones like Iphone7
//abstract classes can not be final. =>
//what happens if the class is final? => you cannot extend it. you can not change any values in it.
//Because the whole point of abstract classes is to be extended.
//abstract classes can not be market private.
//public abstract class Patient {
//abstract methods do not have any implementation
//which means we know and require each child class to have a takeTylanol method
//and should write the specific logic to each child class
