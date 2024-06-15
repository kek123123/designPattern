package main.behavior.observer;

public class SubB implements Observerable {

    @Override
    public void called() {
        System.out.println("B 호출");
    }
}
