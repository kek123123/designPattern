package main.ex.ex11.after;

public class AfterAirplane implements AfterTransport {
    @Override
    public void move() {
        System.out.println("The airplane is moving");
    }
}
