package com.java.class35;

public class SeniorPatients extends BasePatient{
    public void takeTylenol(){
        System.out.println("For senior patients: recommended dosage is 500mg");
    }

    public double chargePatient(double originalBalance, double amountReceived) {
        double discount = 0.4;
        return (originalBalance - (originalBalance*discount)) - amountReceived;
    }
}
