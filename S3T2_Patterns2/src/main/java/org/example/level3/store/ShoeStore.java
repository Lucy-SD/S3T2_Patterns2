package org.example.level3.store;

import org.example.level3.implementations.BankAccountDebit;
import org.example.level3.implementations.CreditCard;
import org.example.level3.implementations.PayPal;
import org.example.level3.interfaces.PaymentMethod;
import org.example.level3.processor.PaymentGateway;

public class ShoeStore {
    public void sales() {
        PaymentGateway gateway = new PaymentGateway();

        PaymentMethod creditCard = new CreditCard("1234-5678-9101-1121", "Migue Granados");
        PaymentMethod payPal = new PayPal("migueg@mail.com");
        PaymentMethod internationalBankDebit = new BankAccountDebit("987654321", "456789123");
        PaymentMethod nationalBankDebit = new BankAccountDebit("1874695147");

        System.out.println("\n*** Realizando compra con Tarjeta ***");
        gateway.executePayment(133.87, creditCard);

        System.out.println("*** Realizando compra con PayPal ***");
        gateway.executePayment(87.22, payPal);

        System.out.println("*** Realizando compra Internacional con Debito Bancario ***");
        gateway.executePayment(157.29, internationalBankDebit);

        System.out.println("*** Realizando compra Nacional con Debito Bancario ***");
        gateway.executePayment(187.26, nationalBankDebit);
    }
}
