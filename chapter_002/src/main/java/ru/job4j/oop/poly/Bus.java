package ru.job4j.oop.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
        int go = 1;
        int stop = 0;
    }

    @Override
    public void passengers(int passengers) {
        if (passengers > 0 ){
            Bus bus1 = new Bus();
            bus1.ride();
        }
    }

    @Override
    public double refuel(double fuel) {
        double litter = 49.99;
        return fuel * litter;
    }
}
