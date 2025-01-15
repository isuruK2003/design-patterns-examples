package dev.isuru;

import java.util.ArrayList;
import java.util.List;

class Observable {
    private final List<Observer> observers;
    private Integer currentNumber;

    public Observable() {
        this.observers = new ArrayList<>();
        this.currentNumber = 0;
    }

    public synchronized void add(Observer observer) {
        this.observers.add(observer);
    }

    public synchronized void remove(Observer observer) {
        this.observers.remove(observer);
    }

    private synchronized void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.notifyObserver("Current number: " + currentNumber);
        }
    }

    public synchronized void updateStatus() {
        this.currentNumber++;
        this.notifyObservers();
    }

    public synchronized Integer getCurrentNumber() {
        return this.currentNumber;
    }
}
