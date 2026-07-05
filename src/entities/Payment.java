package entities;

import Enums.TypeStudent;
import service.DiscountRegular;
import service.DiscountStudant;
import service.PaymentProcessor;

public class Payment {
    private double finalValue;
    private boolean isPayed;
    private Registration registration;

    public Payment() {
    }
    public Payment(Registration registration) {
        this.registration = registration;
    }
    public boolean getIsPayed(){
        return isPayed;
    }
    public void setIsPayed(boolean isPayed){
        this.isPayed = isPayed;
    }
    public double GenerateFinalValue(){
         PaymentProcessor paymentProcessor = new PaymentProcessor();
        if(registration.getTypeStudent() != (TypeStudent.STUDENT)){
            DiscountRegular discountRegular = new DiscountRegular();
            this.finalValue =  paymentProcessor.CalculatePayment(registration, discountRegular);
        } else{
            DiscountStudant discountStudant = new DiscountStudant();
            this.finalValue = paymentProcessor.CalculatePayment(registration, discountStudant);
        }
        return  finalValue;
    }


}
