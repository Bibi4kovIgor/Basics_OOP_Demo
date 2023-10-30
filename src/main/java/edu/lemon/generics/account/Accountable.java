package edu.lemon.generics.account;

public interface Accountable<T> {
    T getId();
    void setId(T id);
}
