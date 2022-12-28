package main.create.factoryMethod;

public class Client {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NyPizzaStroe();
        Pizza nyPizza1 = pizzaStore.createPizza("cheese");

        PizzaStore pizzaStore2 = new ChicagoPizzaStroe();
        Pizza nyPizza2 = pizzaStore2.createPizza("cheese");
    }
}
