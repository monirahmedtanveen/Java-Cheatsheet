package com.monirtanveen;

public class Main {


    public static void main(String[] args) {
        Dog dog = new Dog("Akita Inu");
        Fish fish = new Fish("Nimo");

//        Animal animal = new Animal(); /** It can not be done. because Animal is an abstract class.  */
        Animal animal = new Animal() {
            @Override
            public void move() {
                System.out.println("Animal is moving");
            }
        };

        Male male = new Male("Walter White");

        male.sleep();
        male.eat();
        male.refuel(15.5);
        male.drive();
        male.accelerate();
        male.drive(95);
        male.move();
        animal.move();
        dog.move();
        fish.move();
    }
}
