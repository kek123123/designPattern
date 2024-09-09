package main.structure.decorate.v3;

public class TakeOutDecorator implements Decorator {

    private Coffee coffee;

    public TakeOutDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return this.coffee.getCost() + 500.0;
    }

    @Override
    public void operation() {
        coffee.operation();
        System.out.println("포장");
    }
}
