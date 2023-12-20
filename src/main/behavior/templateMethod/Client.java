package main.behavior.templateMethod;

public class Client {

    public static void main(String[] args) {
        Template templateA = new ConcreteAClass();
        System.out.println(templateA.tempalteMethod());

        Template templateB = new ConcreteBClass();
        System.out.println(templateB.tempalteMethod());
    }
}
