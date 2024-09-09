package main.ex.ex7.after;

public class CircleFactory implements Factory {
    @Override
    public AfterShape create() {
        return new AfterCircle();
    }
}
