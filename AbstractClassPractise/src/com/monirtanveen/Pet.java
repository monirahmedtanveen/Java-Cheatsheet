package com.monirtanveen;

public abstract class Pet extends Animal {
    public Pet(String name) {
        super.name = name;
    }

    final public void barking() {
        System.out.println("Pet is barking");
    }
}
