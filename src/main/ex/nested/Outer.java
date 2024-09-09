package main.ex.nested;

public class Outer {

    private int outerInt = 1;

    class Inner {
        void test() {
            System.out.println(outerInt);
        }
    }

    static class StaticInner {
        void test() {
            System.out.println();
        }

        static void test2() {
            System.out.println();
        }
    }
}
