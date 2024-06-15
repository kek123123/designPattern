package main.structure.decorate;

public class Cream implements Ingredients {

    private Coffee coffee;

    public Cream(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void action() {
        System.out.println("크림 추가");
        coffee.action();
    }
}
