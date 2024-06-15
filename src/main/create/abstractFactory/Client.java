package main.create.abstractFactory;

public class Client {

    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        Button buttonA = factoryA.createButton();
        Checkbox checkboxA = factoryA.createCheckbox();

        buttonA.click();
        checkboxA.open();

        FactoryB factoryB = new FactoryB();
        Button buttonB = factoryB.createButton();
        Checkbox checkboxB = factoryB.createCheckbox();

        buttonB.click();
        checkboxB.open();
    }
}
