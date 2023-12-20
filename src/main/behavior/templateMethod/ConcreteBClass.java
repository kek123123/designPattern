package main.behavior.templateMethod;

public class ConcreteBClass implements Template {
    @Override
    public String call() {
        return "B 클래스 구현";
    }
}
