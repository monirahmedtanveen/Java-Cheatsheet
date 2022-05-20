package com.monirtanveen;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Shiba Inu");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Penguin");
        penguin.breathe();
        penguin.eat();
        penguin.fly();
    }
}
