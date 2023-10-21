package edu.lemon.program;

import edu.lemon.person.Person;

public class Main {
    public static void main(String[] args) {
        Person[] authors = { new Person("Joshua Bloch", 70) };
        Book effectiveProgramming = new Book("Effective Programming", authors);
        effectiveProgramming.print();
        effectiveProgramming.print("Some book of programming", effectiveProgramming);
        Printable.printAdditionalInfo();
        Magazine magazine = new Magazine();
    }

}
