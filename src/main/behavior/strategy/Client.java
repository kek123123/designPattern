package main.behavior.strategy;

public class Client {

    public static void main(String[] args) {
        Context contextA = new Context(new StrategyA());
        contextA.call();

        Context contextB = new Context(new StrategyB());
        contextB.call();
    }
}
