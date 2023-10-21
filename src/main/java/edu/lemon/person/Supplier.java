package edu.lemon.person;

import edu.lemon.product.Product;

import java.util.Arrays;

public final class Supplier extends Person {
    private final Product[] products;

    public Supplier(String name, int age, Product[] products) {
        super(name, age);
        this.products = products;
    }

    public Supplier(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return Arrays.copyOf(products, products.length);
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "products=" + Arrays.toString(products) +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
