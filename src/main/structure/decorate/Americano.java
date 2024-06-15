package main.structure.decorate;

public class Americano implements Coffee {

    @Override
    public void action() {
        System.out.println("아메리카노");
    }
}
