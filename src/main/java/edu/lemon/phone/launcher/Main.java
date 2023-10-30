package edu.lemon.phone.launcher;

import edu.lemon.phone.Phone;
import edu.lemon.phone.SmartPhone;
import edu.lemon.phone.WiredPhone;
import edu.lemon.phone.WirelessPhone;

import java.lang.management.ManagementFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) {
        Phone wiredPhone = new WiredPhone("+38077488", 2020);
        Phone wirelessPhone = new WirelessPhone();

        SmartPhone smartPhone = new SmartPhone(
                "+380",
                2021,
                48,
                100,
                3,
                8,
                "Arm",
                4,
                3500);

        Phone[] phones = {wiredPhone, wirelessPhone, smartPhone};

        for (Phone phone : phones) {
            System.out.println(phone);
        }

        System.out.println(wiredPhone.getYear());
        System.out.println(wiredPhone);
    }
}
