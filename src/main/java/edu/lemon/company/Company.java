package edu.lemon.company;

import java.time.Instant;

public final class Company {
    private String name;
    private Instant birthdate;
    private int size;

    public static void getCompanyName(String name){
        System.out.println(name);
    }

    public Company(String name, Instant birthdate, int size) {
        this.name = name;
        this.birthdate = birthdate;
        this.size = size;
    }

    public Company() {
        this.name = "";
        this.birthdate = Instant.now();
        size = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Instant birthdate) {
        this.birthdate = birthdate;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", size=" + size +
                '}';
    }
}
