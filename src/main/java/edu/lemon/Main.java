package edu.lemon;

import edu.lemon.company.Company;
import edu.lemon.person.Client;
import edu.lemon.person.Person;
import edu.lemon.person.Supplier;
import edu.lemon.person.Worker;
import edu.lemon.product.Order;
import edu.lemon.product.Product;

import java.math.BigDecimal;
import java.time.Instant;


public class Main {

    private int a;
    private int b;

    private int c;

    private static int someStaticValue = 1;


    {
        System.out.println(a);
        System.out.println(b);
        Person person = new Person(); // refers to the same location in heap
        Person person2 = person;
        person.setAge(52);
        System.out.println(person);
        System.out.println(person2);

        person2.setAge(25);
        System.out.println(person);
        System.out.println(person2);

    }

    static {
        someStaticValue = 54;
        System.out.println(someStaticValue);
    }



    public static void main(String[] args) throws CloneNotSupportedException {

        Main main = new Main();

        Person joe = new Person("Joe", 25);


        Person joe2 = (Person) joe.clone();
        Product[] products = {
                new Product("Bread", new BigDecimal("25.22")),
                new Product("Juice", new BigDecimal("55.5")),
                new Product("Meat", new BigDecimal("250.55"))};
        Order[] orders = {new Order(products)};

        System.out.println(joe);
        System.out.println("Cloned joe: " + joe2);

        System.out.println(joe);

        Worker worker = new Worker("Ihor", 31, new Company("Grown Seed", Instant.now(), 3));
        Client client = new Client("Joe", 22, orders);
        Supplier supplier = new Supplier("Edward", 45, products);

        System.out.println(worker.getCompany());
        System.out.println(worker);
        System.out.println(client);
        System.out.println(supplier);


        Company company = new Company();
        System.out.println(company.getSize());

        String companyName = "HornsAndHooves";
        Company.getCompanyName(companyName);

        Person[] people = {joe, worker, client, supplier};
        for (Person person : people) {
            System.out.println(person);
        }


    }

}