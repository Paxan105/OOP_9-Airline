package com.company.Planes;

/**
 * Created by Pasha on 26.01.2016.
 */
 
 /*
        На большых пассажирских самолетах есть одел для перевозки относительно большых грузов
 */
 
 
public class Large_passenger_plane extends Plane {

    public Large_passenger_plane(int fuel_consumption, int range_flight, int passenger_seats, int load_capacity) {
        super(fuel_consumption, range_flight, passenger_seats, load_capacity);
    }



    @Override
    public String toString() {
        return "Большой пассажирский самолет"+super.toString();
    }
}
