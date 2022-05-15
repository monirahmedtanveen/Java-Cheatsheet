package com.monirtanveen;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Shiba Inu");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Parrot");
        parrot.breathe();
        parrot.eat();
    }
}
