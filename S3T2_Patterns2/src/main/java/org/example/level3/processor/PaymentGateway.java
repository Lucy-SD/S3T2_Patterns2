package org.example.level3.processor;

import org.example.level3.interfaces.PaymentMethod;

public class PaymentGateway {
    public void executePayment(double amount, PaymentMethod paymentMethod) {
        System.out.println("Iniciando transaccion.");
        paymentMethod.processPayment(amount);
        System.out.println("Transaccion completada exitosamente.\n");
    }
}
