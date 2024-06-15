package main.create.factoryMethod.v2;

public class Context {

    private AbstractFactory factory;

    public Context(AbstractFactory factory) {
        this.factory = factory;
    }

    public void action() {
        System.out.println("Context call");
        Product product = create();
        System.out.println(product.getClass());
    }

    private Product create() {
        return factory.create();
    }
}
