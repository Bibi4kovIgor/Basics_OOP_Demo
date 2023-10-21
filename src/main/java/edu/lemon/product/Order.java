package edu.lemon.product;

import java.util.Arrays;

public class Order {
    private final Product[] products;

    public Order(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return Arrays.copyOf(products, products.length);
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + Arrays.toString(products) +
                '}';
    }
}
