package com.sda.lectia4.generics.extendskeyword;

public class Main {
    public static void main(String[] args){

        Car car = new Car();
        Boat boat = new Boat();

        Garage<Car> garage = new Garage<>(car);
        garage.repairVehicle();
        Car car2 = new Car();
        garage.repairVehicle(car2);

        Garage<Boat> boatGarage = new Garage<>(boat);
        boatGarage.repairVehicle();

    }
}
