package com.platzi.javatest.payments;

// import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProccesorTest {

    @Test
    public void payment_is_correct() {

        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);

        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        PaymentProccesor paymentProccesor = new PaymentProccesor(paymentGateway);

        // boolean result = paymentProccesor.makePayment(1000);
        assertTrue(paymentProccesor.makePayment(1000));
    }

    @Test
    public void payment_is_wrong() {

        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);

        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        PaymentProccesor paymentProccesor = new PaymentProccesor(paymentGateway);

        // boolean result = paymentProccesor.makePayment(1000);
        assertFalse(paymentProccesor.makePayment(1000));
    }

}