package main.behavior.templateMethod;

public interface Template {

    default String tempalteMethod() {
        System.out.println("템플릿 메서드");
        if (!this.hook()) {
            return "hook false";
        }
        return call();
    }

    String call();

    default boolean hook() {
        return true;
    }

    private void test() {

    }
}
