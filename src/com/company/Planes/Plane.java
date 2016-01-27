package com.company.Planes;

/**
 * Created by Pasha on 26.01.2016.
 */
public class Plane {

    private int fuel_consumption;

    private int range_flight;

    private int passenger_seats;

    private int load_capacity;

    public Plane(int fuel_consumption, int range_flight, int passenger_seats, int load_capacity) {
        this.fuel_consumption = fuel_consumption;
        this.range_flight = range_flight;
        this.passenger_seats = passenger_seats;
        this.load_capacity = load_capacity;
    }

    public int getFuel_consumption() {
        return fuel_consumption;
    }

    public int getRange_flight() {
        return range_flight;
    }

    public int getPassenger_seats() {
        return passenger_seats;
    }

    public int getLoad_capacity() {
        return load_capacity;
    }

    @Override
    public String toString() {
        return " --- " +
                "Потребление горючого=" + fuel_consumption +
                "л/км, Дальность полета=" + range_flight +
                "км, Количество пасажирских мест=" + passenger_seats +
                ", Грузоподьемность=" + load_capacity+"тонн";
    }
}
