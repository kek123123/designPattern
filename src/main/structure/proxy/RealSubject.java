package main.structure.proxy;

public class RealSubject implements Subject {

    @Override
    public String action() {
        System.out.println("real subject");
        return "real";
    }
}
