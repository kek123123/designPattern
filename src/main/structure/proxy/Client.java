package main.structure.proxy;


public class Client {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxySubject = new Proxy(subject);
        proxySubject.action();
        proxySubject.action();
    }
}
