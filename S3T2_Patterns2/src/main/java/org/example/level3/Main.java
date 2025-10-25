package org.example.level3;

import org.example.level3.payment.BankAccountDebit;
import org.example.level3.payment.CreditCard;
import org.example.level3.payment.PayPal;
import org.example.level3.payment.PaymentMethod;
import org.example.level3.store.ShoeStore;

public class Main {
    public static void main(String[] args) {

        ShoeStore store = new ShoeStore();
        PaymentMethod creditCard = new CreditCard("1234-5678-9101-1121", "Migue Granados");
        PaymentMethod payPal = new PayPal("migueg@mail.com");
        PaymentMethod internationalBankDebit = new BankAccountDebit("987654321", "456789123");
        PaymentMethod nationalBankDebit = new BankAccountDebit("1874695147");

        System.out.println("\n*** Realizando compra con Tarjeta ***\n");
        store.sale(133.87, creditCard);
        System.out.println("\n*** Realizando compra con PayPal ***\n");
        store.sale(87.22, payPal);
        System.out.println("\n*** Realizando compra Internacional con Debito Bancario ***\n");
        store.sale(157.29, internationalBankDebit);
        System.out.println("\n*** Realizando compra Nacional con Debito Bancario ***\n");
        store.sale(187.26, nationalBankDebit);
    }
}