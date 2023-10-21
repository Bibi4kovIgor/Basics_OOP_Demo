package edu.lemon.phone;

public class WirelessPhone extends Phone{

    private final int workTime;
    private final int distance;

    public WirelessPhone() {
        super();
        workTime = 1;
        distance = 1;
    }

    public WirelessPhone(String phoneId, int year, int workTime, int distance) {
        super(phoneId, year);
        this.workTime = workTime;
        this.distance = distance;
    }

    @Override
    public String call(String name) {
        return "call from wireless phone";
    }

    @Override
    public String receive(String name) {
        return "call was received from wireless phone";
    }

    public int getWorkTime() {
        return workTime;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "WirelessPhone{" +
                "workTime=" + workTime +
                ", distance=" + distance +
                '}';
    }
}
