package main.structure.proxy;

public class Proxy implements Subject {

    private Subject subject;
    private String chacheContents;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String action() {
        System.out.println("proxy 호출");
        if (chacheContents == null) {
            chacheContents = subject.action();
        }
        return chacheContents;
    }
}
