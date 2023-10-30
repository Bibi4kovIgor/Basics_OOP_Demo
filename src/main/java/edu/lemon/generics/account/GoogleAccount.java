package edu.lemon.generics.account;

public class GoogleAccount<T> implements Accountable<T>{
    T token;
    @Override
    public T getId() {
        return token;
    }

    @Override
    public void setId(T id) {
        this.token = id;
    }

    public void setPassword(T password) {

    }
}
