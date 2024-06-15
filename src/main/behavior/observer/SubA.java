package main.behavior.observer;

public class SubA implements Observerable {

    @Override
    public void called() {
        System.out.println("A 호출");
    }
}
