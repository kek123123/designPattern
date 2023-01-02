package main.create.factoryMethod;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        this.name = "nyCheesePizza";
        this.dough = "cheese";
        this.sauce = "cream";
        this.toppings.add("cheese");
    }
}
