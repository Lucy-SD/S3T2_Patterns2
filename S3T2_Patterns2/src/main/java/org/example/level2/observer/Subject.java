package org.example.level2.observer;

public interface Subject {
    void register(Observer o);
    void remove(Observer o);
    void notifyObservers();
}
