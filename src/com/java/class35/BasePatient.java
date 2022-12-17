package com.java.class35;

public abstract class BasePatient {
    double payment;
    public abstract void takeTylenol();
    // create a method to inquire the payment
    //child has %10 discount
    //general has %0 discount
    //senior has %40 discount
    //disabled has %20 discount
    public abstract double chargePatient(double balance, double amount);

}
