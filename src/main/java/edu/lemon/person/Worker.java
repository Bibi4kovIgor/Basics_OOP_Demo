package edu.lemon.person;

import edu.lemon.company.Company;

import java.util.Arrays;

public class Worker extends Person {
    private Company company;

    public Worker(String name, int age, Company company) {
        super(name, age);
        this.company = company;
    }

    public Worker() {
        super();
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String getPersonInfo(String... params) {
        return super.getPersonInfo("Worker is " + Arrays.toString(params));
    }

    @Override
    public String toString() {
        return "Worker{" +
                "company=" + company.getName() +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
