package com.monirtanveen;

public class Fish extends Pet {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(super.name + " fish is swimming");
    }
}
