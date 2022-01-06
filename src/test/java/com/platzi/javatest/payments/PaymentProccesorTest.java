package com.platzi.javatest.payments;

// import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProccesorTest {

    private PaymentGateway paymentGateway;
    private PaymentProccesor paymentProccesor;

    @Before
    public void setup(){
        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProccesor = new PaymentProccesor(paymentGateway);
    }

    @Test
    public void payment_is_correct() {
        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        // boolean result = paymentProccesor.makePayment(1000);
        assertTrue(paymentProccesor.makePayment(1000));
    }

    @Test
    public void payment_is_wrong() {
        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        // boolean result = paymentProccesor.makePayment(1000);
        assertFalse(paymentProccesor.makePayment(1000));
    }

}