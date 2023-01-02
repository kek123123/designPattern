package main.create.factoryMethod;

public class Client {

    //객체를 생성하기 위한 인터페이스를 정의하는데, 어떤 클래스의 인스턴스를
    //만들지는 서브클래스에서 결정하게 만든다. 인스턴스를 만드는 일을 서브클래스에게 맡기는 것.

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NyPizzaStroe();
        Pizza nyPizza = nyPizzaStore.orderPizza("cheese");

        System.out.println(nyPizza.getname());

        PizzaStore chicagoPizzaStroe = new ChicagoPizzaStroe();
        Pizza chicagoPizza = chicagoPizzaStroe.orderPizza("cheese");

        System.out.println(chicagoPizza.getname());
    }
}
