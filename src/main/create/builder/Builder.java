package main.create.builder;

public class Builder {

    private Product product;

    public Builder() {
        this.product = new Product();
    }

    public Builder name(String name) {
        product.setName(name);
        return this;
    }

    public Builder country(String country) {
        product.setCountry(country);
        return this;
    }

    public Builder amount(long amount) {
        product.setAmount(amount);
        return this;
    }

    public Product build() {
        return product;
    }
}
