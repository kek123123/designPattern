package main.behavior.strategy;

public class StrategyA implements Strategy {

    @Override
    public void action() {
        System.out.println("전략 A");
    }
}
