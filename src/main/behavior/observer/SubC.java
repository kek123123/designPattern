package main.behavior.observer;

public class SubC implements Observerable {

    @Override
    public void called() {
        System.out.println("C 호출");
    }
}
