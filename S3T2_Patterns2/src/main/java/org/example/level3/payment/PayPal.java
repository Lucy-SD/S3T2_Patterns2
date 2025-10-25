package org.example.level3.payment;

public class PayPal implements PaymentMethod {
    private final String email;

    public PayPal(String email) {
        this.email = email;
    }
    public void processPayment(double amount){
        System.out.printf("Procesando el pago con PayPal: $%.2f.%n", amount);
        System.out.println("Cuenta: " + email + ".");
        System.out.println("Pago efectuado correctamente.");
    }
}
