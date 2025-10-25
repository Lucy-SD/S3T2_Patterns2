package org.example.level3.payment;

public interface PaymentCallback {
    void paymentSuccess(double amount);
    void paymentError(String message);
}
