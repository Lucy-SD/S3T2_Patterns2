package org.example.level3.implementations;

import org.example.level3.interfaces.PaymentMethod;

public class BankAccountDebit implements PaymentMethod {
    private final String ibanNumber;
    private String swiftBicNumber;

    public BankAccountDebit(String ibanNumber) {
        this.ibanNumber = ibanNumber;
    }

    public BankAccountDebit(String ibanNumber, String swiftBicNumber) {
        this.ibanNumber = ibanNumber;
        this.swiftBicNumber = swiftBicNumber;
    }
    public void processPayment(double amount) {
        System.out.printf("Procesando el pago con Debito Bancario: $%.2f.%n", amount);
        if(swiftBicNumber != null){
            System.out.println("IBAN: " + ibanNumber + ".\nSWIFT/BIC: " + swiftBicNumber + ".");
        } else {
            System.out.println("IBAN: " + ibanNumber + ".");
        }

        System.out.println("Pago efectuado correctamente.");
    }
}
