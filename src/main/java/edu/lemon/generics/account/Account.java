package edu.lemon.generics.account;

public class Account<T, U> implements Accountable<T> {

    T accountId;
    U password;
    @Override
    public T getId() {
        return accountId;
    }

    @Override
    public void setId(T id) {
        this.accountId = id;

    }

    public void setPassword(U password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", password=" + password +
                '}';
    }
}
