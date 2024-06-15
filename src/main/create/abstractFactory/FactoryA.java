package main.create.abstractFactory;

public class FactoryA implements AbstractFactory {

    @Override
    public Button createButton() {
        return new ButtonA();
    }

    @Override
    public Checkbox createCheckbox() {
        //return () -> System.out.println("a");
        return new CheckboxA();
    }
}
