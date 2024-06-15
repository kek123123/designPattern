package main.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    List<Observerable> list = new ArrayList<>();

    @Override
    public void addObserver(Observerable observerable) {
        list.add(observerable);
    }

    @Override
    public void removeObserver(Observerable observerable) {
        list.remove(observerable);
    }

    @Override
    public void call() {
        for (Observerable observerable : list) {
            observerable.called();
        }
    }
}
