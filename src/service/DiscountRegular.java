package service;

import Interfaces.CalculateDiscount;

public class DiscountRegular implements CalculateDiscount {

    private final double discount = 0;
    public DiscountRegular() {
    }
    @Override
    public double calculateFinalValue(double baseValue) {
        return baseValue * discount;
    }
}
