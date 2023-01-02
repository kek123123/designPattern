package main.create.factoryMethod;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        this.name = "chicagoCheesePizza";
        this.dough = "cheese";
        this.sauce = "tomato";
        this.toppings.add("cheese");
    }
}
