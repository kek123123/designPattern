package main.ex.ex9.after;

public class Espresso implements AfterCoffee {

    private double cost = 0.5;
    private String description = "espresso";

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
