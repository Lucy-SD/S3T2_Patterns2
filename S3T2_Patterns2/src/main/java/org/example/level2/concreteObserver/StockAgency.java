package org.example.level2.concreteObserver;

import org.example.level2.observer.Observer;

public class StockAgency implements Observer {
    private final String name;

    public StockAgency(String name) {
        this.name = name;
    }

    @Override
    public void update(double index, String status) {
        System.out.printf("Agencia --> %s: Mercado %s (indice: %.2f).%n", name, status, index);
    }
}
