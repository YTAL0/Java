package service;

import Interfaces.CalculateDiscount;

public class DiscountStudant implements CalculateDiscount {

    private final double discount = 0.2;

    public DiscountStudant() {
    }

    @Override
    public double calculateFinalValue(double baseValue) {
        return baseValue * discount;
    }
}
