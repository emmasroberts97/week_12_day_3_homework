package CarPeople;

import Vehicles.Vehicle;

import java.util.ArrayList;

public abstract class Person implements IBuy{

    private String name;
    private int money;
    private ArrayList<Vehicle> cars;

    public Person(String name, int money){
        this.name = name;
        this.money = money;
        this.cars = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ArrayList<Vehicle> getCars() {
        return cars;
    }

    public void addCar(Vehicle vehicle){
        cars.add(vehicle);
    }

    public void removeCar(Vehicle vehicle){
        cars.remove(vehicle);
    }

    public void buy(Person person, Vehicle vehicle){
        if (person.getCars().contains(vehicle)){
            money -= vehicle.getPrice();
            addCar(vehicle);

            person.money += vehicle.getPrice();
            person.removeCar(vehicle);
        }
    }

}
