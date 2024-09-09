package main.ex.function;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Function<String, String> function = client.getFunction();
        String result = function.apply("A");

        System.out.println("result = " + result);

        client.supply(() -> "abc");
    }

    public Function<String, String> getFunction() {
        return str -> str.toLowerCase();
    }

    public String applyFunction(Function<String, String> function) {
        return function.apply("");
    }

    public void consumer(Consumer<String> consumer) {
        consumer.accept("");
    }

    public void supply(Supplier<String> supplier) {
        String result = supplier.get();
        System.out.println("result = " + result);
    }

}
