package com.company.Planes;

/**
 * Created by Pasha on 26.01.2016.
 */
public class Cargo_plane extends Plane {

    public Cargo_plane(int fuel_consumption, int range_flight, int load_capacity) {
        super(fuel_consumption, range_flight,0, load_capacity);
    }


    @Override
    public String toString() {
        return "Грузовой самолет"+super.toString();
    }
}
