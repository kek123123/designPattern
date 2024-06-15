package main.create.abstractFactory;

public class FactoryB implements AbstractFactory {

    @Override
    public Button createButton() {
        return new ButtonB();
    }

    @Override
    public Checkbox createCheckbox() {
        //return () -> System.out.println("a");
        return new CheckboxB();
    }
}
