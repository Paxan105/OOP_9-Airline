package com.company.Planes;

/**
 * Created by Pasha on 26.01.2016.
 */
public class Small_passenger_aircraft extends Plane {

    public Small_passenger_aircraft(int fuel_consumption, int range_flight, int passenger_seats) {
        super(fuel_consumption, range_flight, passenger_seats, 0);
    }

    @Override
    public String toString() {
        return "Малый пасажирский самолет"+super.toString();
    }
}
