package main.ex.ex9;

import main.ex.ex9.after.*;
import main.ex.ex9.before.Coffee;

public class Client {

    public static void main(String[] args) {
        Coffee coffee = new Coffee("Espresso");
        coffee.addChocolate();

        double cost = coffee.getCost();
        System.out.println("cost = " + cost);
        String description = coffee.getDescription();
        System.out.println("description = " + description);

        AfterCoffee afterCoffee = new Espresso();
        AbstractDecorator choco = new ChocolateDecorator(afterCoffee);
        AbstractDecorator milk = new MilkDecorator(choco);

        double cost1 = milk.getCost();
        System.out.println("cost1 = " + cost1);
        String description1 = milk.getDescription();
        System.out.println("description1 = " + description1);
    }
}
