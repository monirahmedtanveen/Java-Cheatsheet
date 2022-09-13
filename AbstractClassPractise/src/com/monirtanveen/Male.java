package com.monirtanveen;

public class Male extends Pet implements Activity, FuelVehicle {

    public Male(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "This is Male Class";
    }

    @Override
    public void move() {
        System.out.println(super.name + " male is moving for cook meth");
    }

//    @Override
//    public void barking() {
//
//    }

    @Override
    public void drive() {
        System.out.println(super.name + " is driving");
    }

    @Override
    public void drive(int speed) {
        System.out.println(super.name + " has driving with a speed of " + speed + " km. " + " Maximum speed is " + MAX_SPEED);
    }

    @Override
    public void sleep() {
        System.out.println(super.name + " is sleeping");
    }

    @Override
    public void eat() {
        System.out.println(super.name + " is eating");
    }

    @Override
    public void refuel(double litreAmount) {
        System.out.println(super.name + " is refueling vehicles with " + litreAmount + " litres");
    }

    @Override
    public void accelerate() {
        FuelVehicle.super.accelerate();
        System.out.println("Accelerating by " + super.name);
    }
}
