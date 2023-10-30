package edu.lemon.generics.account;

public class MicrosoftAccount<T> implements Accountable<T> {
    T id;
    T password;
    @Override
    public T getId() {
        return id;
    }

    @Override
    public void setId(T id) {
        this.id = id;
    }

    public void setPassword (T password) {
        this.password = password;
    }

    public <U> void printToken(U secretKey) {
        System.out.printf("your token is %s&&%s&&%s ", secretKey, id, password);
    }

    @Override
    public String toString() {
        return "MicrosoftAccount{" +
                "id=" + id +
                ", password=" + password +
                '}';
    }
}
