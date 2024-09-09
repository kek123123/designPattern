package main.behavior.templateMethod.v2;

public abstract class AbstractTemplate {

    public void call() {
        System.out.println("call");
        operation();
    }
    abstract void operation();
}
