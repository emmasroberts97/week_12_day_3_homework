package CarPeople;

import Vehicles.Vehicle;

public class Dealership extends Person{

    public Dealership(String name, int till){
        super(name, till);
    }

    public void repairCar(Vehicle vehicle, int repair){
        int currentPrice = vehicle.getPrice();
        int newPrice = currentPrice += repair;

        int dealershipMoney = getMoney();
        int newTillAmount = dealershipMoney -= repair;

        setMoney(newTillAmount);
        vehicle.setPrice(newPrice);
    }
}
