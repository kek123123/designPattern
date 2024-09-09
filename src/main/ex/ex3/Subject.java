package main.ex.ex3;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void addNotification(Observer observer) {
        observers.add(observer);
    }

    public void removeNotification(Observer observer) {
        observers.remove(observer);
    }

    public void push() {
        for (Observer observer : observers) {
            observer.call();
        }
    }
}
