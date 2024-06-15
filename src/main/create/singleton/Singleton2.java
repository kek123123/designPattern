package main.create.singleton;

public class Singleton2 {

    private static volatile Singleton2 instance;

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (instance) {
                instance = new Singleton2();
            }
        }

        return instance;
    }
}
