package com.platzi.javatest.payments;

public class PaymentProccesor {

    private PaymentGateway paymentGateway;

    public PaymentProccesor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment(double amount){
        PaymentResponse response = paymentGateway.requestPayment(new PaymentRequest(amount));
        if (response.getStatus() == PaymentResponse.PaymentStatus.OK){
            return true;
        } else {
            return false;
        }
    }
}
