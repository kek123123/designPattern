package main.ex.ex9.after;

public abstract class AbstractDecorator implements AfterCoffee {
    AfterCoffee afterCoffee;

    public AbstractDecorator(AfterCoffee afterCoffee) {
        this.afterCoffee = afterCoffee;
    }


    @Override
    public double getCost() {
        return this.afterCoffee.getCost();
    }

    @Override
    public String getDescription() {
        return this.afterCoffee.getDescription();
    }
}
