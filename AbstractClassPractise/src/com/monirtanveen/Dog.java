package com.monirtanveen;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(super.name + " dog is running");
    }
}
