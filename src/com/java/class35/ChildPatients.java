package com.java.class35;

public class ChildPatients extends BasePatient{

    public void takeTylenol(){
        System.out.println("your recommended dosage is 5mg");
    }

    @Override
    public double chargePatient(double originalBalance, double amountReceived) {
        double discount = 0.1;

        return (originalBalance - (originalBalance*discount)) - amountReceived;
    }
}
