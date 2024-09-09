package main.create.builder;

public class Client {

    public static void main(String[] args) {
        Product product = Product.builder()
                .name("pro")
                .amount(10L)
                .country("korea")
                .build();

        System.out.println("product = " + product);
    }
}
