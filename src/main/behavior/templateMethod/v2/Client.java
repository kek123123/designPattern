package main.behavior.templateMethod.v2;

public class Client {

    public static void main(String[] args) {
        AbstractTemplate template = new ConcreteA();
        template.call();

        AbstractTemplate template2 = new ConcreteB();
        template2.call();
    }
}
