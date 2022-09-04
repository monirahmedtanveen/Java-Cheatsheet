package com.monirtanveen;

public final class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    final public void move() {
        System.out.println(name + " human is walking");
    }
}
