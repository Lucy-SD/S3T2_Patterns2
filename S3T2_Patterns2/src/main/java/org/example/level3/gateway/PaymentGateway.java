package org.example.level3.gateway;

import org.example.level3.payment.PaymentCallback;
import org.example.level3.payment.PaymentMethod;

public class PaymentGateway {
    public void executePayment(double amount, PaymentMethod paymentMethod, PaymentCallback paymentCallback) {

        try {
            paymentMethod.processPayment(amount);
            paymentCallback.paymentSuccess(amount);
        } catch (Exception e) {
            paymentCallback.paymentError("Error al procesar el pago.");
        }
    }
}
