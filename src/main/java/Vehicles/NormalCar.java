package Vehicles;

import Components.Engine;
import Components.Tyre;

public class NormalCar extends Vehicle {

    public NormalCar(String make, String model, Engine engine, Tyre tyre, int price){
        super(make, model, engine, tyre, price);
    }
}
