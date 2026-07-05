package service;

import Interfaces.CalculateDiscount;

public class DiscountRegular implements CalculateDiscount {

    private final double Discount = 0;

    @Override
    public double calculateFinalValue(double baseValue) {
        return baseValue;
    }
}
