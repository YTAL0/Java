package service;

import Interfaces.CalculateDiscount;
import entities.Registration;

public class PaymentProcessor {

    public double CalculatePayment(Registration registration, CalculateDiscount strategyCalculate){

        double baseValue = registration.getPlan().getBaseValue();
        double finalValue= strategyCalculate.calculateFinalValue(baseValue);

        return finalValue;
    }
}
