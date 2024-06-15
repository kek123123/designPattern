package main.structure.decorate;

public class Client {

    public static void main(String[] args) {
        Coffee component = new Americano();

        Ingredients sugar = new Sugar(component);
        Ingredients decoratorB = new Cream(sugar);
        Ingredients decoratorC = () -> {
            System.out.println("물 추가");
            decoratorB.action();
        };

        decoratorC.action();

    }
}
