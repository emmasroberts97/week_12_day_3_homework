package Vehicles;

import Components.Engine;
import Components.Tyre;

public class SportsCar extends Vehicle {

    public SportsCar(String make, String model, Engine engine, Tyre tyre, int price){
        super(make, model, engine, tyre, price);
    }
}
