package main.behavior.templateMethod;

public interface Template {

    default String tempalteMethod() {
        System.out.println("템플릿 메서드");
        return call();
    }

    String call();
}
