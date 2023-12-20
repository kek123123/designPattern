package main.behavior.templateMethod;

public class ConcreteAClass implements Template {
    @Override
    public String call() {
        return "A 클래스 구현";
    }
}
