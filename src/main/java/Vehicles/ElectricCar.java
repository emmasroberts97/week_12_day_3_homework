package Vehicles;

import Components.Engine;
import Components.Tyre;

public class ElectricCar extends Vehicle {

    public ElectricCar(String make, String model, Engine engine, Tyre tyre, int price){
        super(make, model, engine, tyre, price);
    }
}
