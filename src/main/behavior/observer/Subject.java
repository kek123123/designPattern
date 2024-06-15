package main.behavior.observer;

import java.util.List;

public interface Subject {

    void addObserver(Observerable observerable);

    void removeObserver(Observerable observerable);

    void call();
}
