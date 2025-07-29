package org.example.level2.concreteSubject;

import org.example.level2.observer.Observer;
import org.example.level2.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class StockAgent implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private double index;
    private String status;

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer ->
                observer.update(index, status));
    }

    public void setMarketState(double index, String status) {
        this.index = index;
        this.status = status;
        notifyObservers();
    }
}
