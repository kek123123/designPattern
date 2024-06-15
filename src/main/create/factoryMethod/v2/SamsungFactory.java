package main.create.factoryMethod.v2;

public class SamsungFactory implements AbstractFactory {

    @Override
    public Product create() {
        return new Samsung();
    }
}
