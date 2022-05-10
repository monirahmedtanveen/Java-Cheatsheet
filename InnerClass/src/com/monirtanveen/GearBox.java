package com.monirtanveen;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public GearBox(int maxGears) {
        this.gears = new ArrayList<Gear>();
        this.maxGears = maxGears;
        Gear neautral = new Gear(0, 0.0);
        this.gears.add(neautral);

        for (int i = 0; i < this.maxGears; i++) {
            addGear(i, i * 5.3);
        }
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if (number > 0 && number <= this.maxGears) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGaer) {
        if (newGaer > 0 && newGaer < this.gears.size() && this.clutchIsIn) {
            this.currentGear = newGaer;
            System.out.println("Gear " + newGaer + " selected.");
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if (this.clutchIsIn) {
            System.out.println("Scream!!");
            return 0.0;
        }
        return revs * gears.get(this.currentGear).getRatio();
    }

    public class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }
    }
}
