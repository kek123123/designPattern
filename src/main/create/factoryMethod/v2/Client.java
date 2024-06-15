package main.create.factoryMethod.v2;

public class Client {

    public static void main(String[] args) {
        AbstractFactory factoryA = new AppleFactory();
        Context contextA = new Context(factoryA);
        contextA.action();

        AbstractFactory factoryB = new SamsungFactory();
        Context contextB = new Context(factoryB);
        contextB.action();
    }
}
