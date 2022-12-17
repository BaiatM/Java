package com.java.class35;

public class DisabledPatients extends BasePatient {
    public void takeTylenol(){
        System.out.println("For disabled patients: recommended dosage is 200mg");
    }

    public double chargePatient(double originalBalance, double amountReceived) {
        double discount = 0.2;

        return (originalBalance - (originalBalance*discount)) - amountReceived;
    }
}
