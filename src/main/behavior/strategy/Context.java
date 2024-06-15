package main.behavior.strategy;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void call() {
        System.out.println("Context call");
        strategy.action();
    }
}
