package edu.lemon.localclass;

public class Main {

    public static void main(String[] args) {
        PersonWithLocalAddress person = new PersonWithLocalAddress("Ihor", "Bibichkov", "+38066545415");
        System.out.println(person);
        System.out.println(person.getAddress("Haharina Ave", 80));
    }
}
