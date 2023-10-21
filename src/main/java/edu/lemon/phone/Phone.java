package edu.lemon.phone;

public abstract class Phone {
    private final String phoneId;
    private final int year;

    public Phone() {
        year = 1900;
        this.phoneId = "";
    }

    public Phone(String phoneId, int year) {
        this.phoneId = phoneId;
        this.year = year;
    }

    public abstract String call(String name);
    public abstract String receive(String name);

    public String getPhoneId() {
        return phoneId;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneId='" + phoneId + '\'' +
                ", year=" + year +
                '}';
    }

    public int getYear() {
        return year;
    }
}
