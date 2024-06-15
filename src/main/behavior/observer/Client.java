package main.behavior.observer;

public class Client {

    public static void main(String[] args) {
        Observerable a = new SubA();
        Observerable b = new SubB();
        Observerable c = new SubC();

        Subject subject = new ConcreteSubject();
        subject.addObserver(a);
        subject.addObserver(b);
        subject.addObserver(c);

        subject.call();

        subject.removeObserver(c);

        subject.call();
    }
}
