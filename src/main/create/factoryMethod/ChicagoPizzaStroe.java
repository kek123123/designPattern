package main.create.factoryMethod;

public class ChicagoPizzaStroe extends PizzaStore {

    @Override
    Pizza createPizza(String type) {

        Pizza pizza = null;

        if(type.equals("cheese")) pizza = new ChicagoStyleCheesePizza();
        //if(type.equals("peper")) pizza = new ChicagoStylePepperoniPizza();
        //if(type.equals("clam")) pizza = new ChicagoStyleClamPizza();
        //if(type.equals("veggie")) pizza = new ChicagoStyleVeggiePizza();

        return pizza;
    }
}