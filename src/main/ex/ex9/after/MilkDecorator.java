package main.ex.ex9.after;

public class MilkDecorator extends AbstractDecorator {

    private double cost = 1.2;
    private String description = " with milk";

    public MilkDecorator(AfterCoffee afterCoffee) {
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
