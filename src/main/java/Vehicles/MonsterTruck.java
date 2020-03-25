package Vehicles;

import Components.Engine;
import Components.Tyre;

public class MonsterTruck extends Vehicle{

    public MonsterTruck(String make, String model, Engine engine, Tyre tyre, int price){
        super(make, model, engine, tyre, price);
    }
}
