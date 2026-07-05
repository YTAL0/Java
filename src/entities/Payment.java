package entities;

import Enums.TypeOfPlan;

public class Payment {
    private double finalValue;
    private boolean isPayed;

    public Payment(double finalValue, boolean isPayed) {
        this.finalValue = finalValue;
        this.isPayed = isPayed;
    }

    public double getFinalValue() {
        return finalValue;
    }
    public boolean getIsPayed(){
        return isPayed;
    }
}
