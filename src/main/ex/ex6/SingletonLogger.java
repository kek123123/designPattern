package main.ex.ex6;

public class SingletonLogger {

    private SingletonLogger() {}

    private static SingletonLogger singletonLogger;

    static class Holder {
        private static final SingletonLogger INSTANCE = new SingletonLogger();
    }

    public SingletonLogger getInstance() {
        return SingletonLogger.Holder.INSTANCE;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
