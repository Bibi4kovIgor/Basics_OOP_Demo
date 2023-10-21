package edu.lemon.phone;

import edu.lemon.phone.Phone;

public class WiredPhone extends Phone {

    public WiredPhone(String phoneId, int year) {
        super(phoneId, year);
    }

    @Override
    public String call(String name) {
        return "call from wired phone";
    }

    @Override
    public String receive(String name) {
        return "call was received from wired phone";
    }
}

