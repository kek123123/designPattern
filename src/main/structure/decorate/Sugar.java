package main.structure.decorate;

public class Sugar implements Ingredients {

    private Coffee coffee;

    public Sugar(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void action() {
        System.out.println("설탕 추가");
        coffee.action();
    }
}
