package com.monirtanveen;

public interface Drivable {
    final int MAX_SPEED = 105;

    public void drive(int speed);

    public default void accelerate() {
        System.out.println("Accelerating...");
    }
}
