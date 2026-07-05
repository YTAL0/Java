package service;

import Interfaces.CalculateDiscount;
import entities.Registration;

public class PaymentProcessor {

    public PaymentProcessor() {
    }

    public double CalculatePayment(Registration registration, CalculateDiscount strategyCalculate){

        double baseValue = registration.getPlan().getBaseValue();

        double finalValue = baseValue - strategyCalculate.calculateFinalValue(baseValue);

        return finalValue;

    }
}
