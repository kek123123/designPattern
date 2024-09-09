package main.structure.decorate.v3;

public class Client {

    public static void main(String[] args) {
        Coffee americano = new Americano();

        double americanoCost = americano.getCost();

        System.out.println("americanoCost = " + americanoCost);


        // 시럽추가
        // 포장추가
        Decorator takeOutDeco = new TakeOutDecorator(americano);

        takeOutDeco.operation();
        double takeOutCost = takeOutDeco.getCost();
        System.out.println("takeOutCost = " + takeOutCost);
    }
}
