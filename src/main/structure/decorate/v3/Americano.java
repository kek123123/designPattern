package main.structure.decorate.v3;

public class Americano implements Coffee {

    @Override
    public void operation() {
        System.out.println("커피 제작");
    }

    @Override
    public double getCost() {
        return 1000.0;
    }
}
