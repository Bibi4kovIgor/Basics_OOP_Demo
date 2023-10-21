package edu.lemon.person;

import edu.lemon.product.Order;

import java.util.Arrays;

public final class Client extends Person {
    private final Order[] orders;

    public Client(String name, int age, Order[] orders) {
        super(name, age);
        this.orders = orders;
    }

    public Client(Order[] orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Client{" +
                "orders=" + Arrays.toString(orders) +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
