package edu.lemon.computer;

public class Main {
    public static void main(String[] args) {
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();
        Computer[] computers = {laptop, desktop};
        for (Computer computer : computers) {
            computer.build();
            computer.buildByPrice();
        }
    }
}
