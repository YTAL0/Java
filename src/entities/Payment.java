package entities;

import Enums.TypeOfPlan;
import service.PaymentProcessor;

public class Payment {
    private double finalValue;
    private boolean isPayed;
    private PaymentProcessor paymentProcessor;

    public Payment(double finalValue) {
        this.finalValue = finalValue;;
    }

    public double getFinalValue() {
        return finalValue;
    }
    public boolean getIsPayed(){
        return isPayed;
    }
    public void setIsPayed(boolean isPayed){
        this.isPayed = isPayed;
    }

}
