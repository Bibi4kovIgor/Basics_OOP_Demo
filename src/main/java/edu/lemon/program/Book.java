package edu.lemon.program;

import edu.lemon.person.Person;

import java.util.Arrays;

public class Book implements Printable {
    private final String name;
    private final Person[] authors;

    public Book(String name, Person[] authors) {
        this.name = name;
        this.authors = authors;
    }

    @Override
    public void print() {
        StringBuilder sb = new StringBuilder();
        for (Person author : authors) {
            sb.append(author).append(" ");
        }
        System.out.printf("Book description. Book name: %s, book authors %s%n", name, sb);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                '}';
    }
}
