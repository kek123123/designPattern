package main.create.factoryMethod.v2;

public class AppleFactory implements AbstractFactory {

    @Override
    public Product create() {
        return new Apple();
    }
}
