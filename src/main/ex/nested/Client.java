package main.ex.nested;

public class Client {

    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.Inner inner = outer.new Inner();

        new Outer().new Inner();

        Outer.StaticInner staticInner = new Outer.StaticInner();
        staticInner.test();

        Outer.StaticInner.test2();
    }
}
