package com.monirtanveen.zoo;

public class Zoo {

    public static void main(String[] args) {
        Cage<Monkey> cage = new Cage<Monkey>(new Monkey(), new Monkey());

        Monkey animal1 = cage.getAnimal1();

        Cage<Lion> lionCage = new Cage<>();
        lionCage.setAnimal1(new Lion());
    }
}
