package main.create.singleton;

public class Singleton3 {

    private Singleton3() {

    }

    private static class Holder {
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return Holder.INSTANCE;
    }
}
