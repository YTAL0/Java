package Enums;

public enum TypeOfPlan {
    MONTHLY(100.0),
    ANNUAL(90.0);

    private final double baseValue;

    TypeOfPlan(double baseValue){
        this.baseValue = baseValue;
    }
    public double getBaseValue(){
        return baseValue;
    }

}
