package main.create.factoryMethod;

public class NyPizzaStroe extends PizzaStore {

    @Override
    Pizza createPizza(String type) {

        Pizza pizza = null;

        if(type.equals("cheese")) pizza = new NYStyleCheesePizza();
        //if(type.equals("peper")) pizza = new NYStylePepperoniPizza();
        //if(type.equals("clam")) pizza = new NYStyleClamPizza();
        //if(type.equals("veggie")) pizza = new NYStyleVeggiePizza();

        return pizza;
    }
}