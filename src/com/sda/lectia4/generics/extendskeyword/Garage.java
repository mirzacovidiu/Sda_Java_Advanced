package com.sda.lectia4.generics.extendskeyword;

public class Garage <T extends Vehicle> {
    private T vehicle;
    public Garage(T vehicle){
        this.vehicle = vehicle;
    }
    public void repairVehicle(){
        vehicle.repair();
    }

    public void repairVehicle(T vehicle){
        this.vehicle = vehicle;
        vehicle.repair();
    }
    public T getVehicle(){
        return vehicle;
    }
}
