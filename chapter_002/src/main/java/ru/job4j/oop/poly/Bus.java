package ru.job4j.oop.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("Едет едет наш автобус");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("42 пассажирёнка");
    }

    @Override
    public double refuel(double fuel) {
        double litter = 49.99;
        double cash = fuel * litter;
        return cash;
    }
}
