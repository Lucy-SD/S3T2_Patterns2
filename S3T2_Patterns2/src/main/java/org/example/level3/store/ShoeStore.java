package org.example.level3.store;

import org.example.level3.payment.*;
import org.example.level3.gateway.PaymentGateway;

public class ShoeStore {

        PaymentGateway gateway = new PaymentGateway();

        public void sale(double price, PaymentMethod method) {
            System.out.println("Iniciando transacción . . .");

        PaymentCallback callback = new PaymentCallback() {
            @Override
            public void paymentSuccess(double amount) {
                System.out.println("Pago con " + method.getClass().getSimpleName() +
                        " de " + amount + "€ completada con éxito.");
            }
            @Override
            public void paymentError(String message) {
                System.out.println("Error al realizar el pago: " + message);
            }
        };

        gateway.executePayment(price, method, callback);
    }
}
