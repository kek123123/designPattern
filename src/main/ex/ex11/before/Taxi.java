package main.ex.ex11.before;

public class Taxi implements Transport {
    @Override
    public void move() {
        System.out.println("The taxi is moving");
    }
}
