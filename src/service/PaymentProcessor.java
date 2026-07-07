package service;

import Interfaces.CalculateDiscount;
import entities.Registration;
import entities.Payment;
import Enums.TypeStudent;

public class PaymentProcessor {

    public PaymentProcessor() {
    }
    public Payment CalculatePayment(Registration registration){

        double baseValue = registration.getPlan().getBaseValue();

        CalculateDiscount strategy;

        if(registration.getTypeStudent() == TypeStudent.STUDENT){
            strategy = new DiscountStudant();
        } else {
            strategy = new DiscountRegular();
        }
        double finalValue = baseValue - strategy.calculateFinalValue(baseValue);

        Payment payment = new Payment(registration);
        payment.setFinalValue(finalValue);

        return payment;

    }
}
