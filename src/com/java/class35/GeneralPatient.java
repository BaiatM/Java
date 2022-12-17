package com.java.class35;

public class GeneralPatient extends BasePatient {
    public void takeTylenol(){
        System.out.println("For general patients: recommended dosage is 250mg");
    }

    public double chargePatient(double originalBalance, double amountReceived) {
        return (originalBalance  - amountReceived);
    }
}
