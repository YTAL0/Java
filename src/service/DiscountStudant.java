package service;

import Interfaces.CalculateDiscount;

public class DiscountStudant implements CalculateDiscount {
    private final double Discount = 0.2;

    @Override
    public double calculateFinalValue(double baseValue) {
        return baseValue * 0.2;
    }
}
