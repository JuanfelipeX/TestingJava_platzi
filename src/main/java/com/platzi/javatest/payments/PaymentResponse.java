package com.platzi.javatest.payments;

public class PaymentResponse {

    private PaymentStatus status;

    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }

    enum PaymentStatus{
        OK, ERROR
    }

    public PaymentStatus getStatus() {
        return status;
    }


}
