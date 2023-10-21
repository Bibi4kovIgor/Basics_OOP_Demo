package edu.lemon.phone;

public class SmartPhone extends WirelessPhone {
    private static final class Cpu {
        private final String name;
        private final int cpuCores;
        private final double productivity;

        public Cpu(String name, int cpuCores, double productivity) {
            this.name = name;
            this.cpuCores = cpuCores;
            this.productivity = productivity;
        }

        @Override
        public String toString() {
            return "Cpu{" +
                    "name='" + name + '\'' +
                    ", cpuCores=" + cpuCores +
                    ", productivity=" + productivity +
                    '}';
        }
    }
    private Cpu cpu;
    private final int ramCapacity;
    public SmartPhone() {
        super();
        cpu = new Cpu("Arm", 4, 3000);
        ramCapacity = 1;
    }

    public SmartPhone(
            String phoneId,
            int year,
            int workTime,
            int distance,
            double cpuFrequency,
            int ramCapacity,
            String cpuName,
            int cpuCores,
            double productivity) {
        super(phoneId, year, workTime, distance);
        this.ramCapacity = ramCapacity;
        cpu = new Cpu(cpuName, cpuCores, productivity);
    }

    public String installApp(String name){
        return name + "app was installed";
    }

    public String launchApp(String name){
        return name + "app was launched";
    }


    @Override
    public String call(String name) {
        return "call from smart phone";

    }

    @Override
    public String receive(String name) {
        return "call was received from smart phone";
    }

    @Override
    public String toString() {
        return "SmartPhone {" +
                "work time " + getWorkTime() +
                " ,phone id " + getPhoneId() +
                " ,cpu = " + cpu +
                ", ramCapacity = " + ramCapacity +
                '}';
    }
}
