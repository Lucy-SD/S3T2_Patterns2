package org.example.level3.payment;

public class CreditCard implements PaymentMethod {
    private final String cardNumber;
    private final String cardOwner;

    public CreditCard(String cardNumber, String cardOwner) {
        this.cardNumber = cardNumber;
        this.cardOwner = cardOwner;
    }
    public void processPayment(double amount) {
        System.out.printf("Procesando el pago con Tarjeta: $%.2f.%n", amount);
        System.out.println("Tarjeta: " + cardNumber + ".\nTitular: " + cardOwner + ".");
        System.out.println("Pago efectuado correctamente.");
    }
}
