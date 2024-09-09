package main.ex.ex9.after;

public class ChocolateDecorator extends AbstractDecorator {

    private double cost = 1.5;
    private String description = " with chocolate";

    public ChocolateDecorator(AfterCoffee afterCoffee) {
        super(afterCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + cost;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + description;
    }
}
