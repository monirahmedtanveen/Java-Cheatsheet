package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = calculateScore(false, 1500);
        System.out.println("After Gameover: " + gameOver);

        double kilometersPerHour = SpeedConverter.toMilesPerHour(10.50);
        System.out.println("Kilometers Per Hour: " + kilometersPerHour);
    }

    public static boolean calculateScore(boolean gameOver, int score) {
        System.out.println("Gameover : " + gameOver);
        System.out.println("Score : " + score);
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("My Minimum Value: " + myMinIntValue);
        System.out.println("My Maximum Value: " + myMaxIntValue);
        System.out.println("Busted Max Value: " + (myMaxIntValue + 1));
        System.out.println("Busted Min Value: " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;
        System.out.println("My Max Int Test: " + myMaxIntTest);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("My Byte Min Value: " + myMinByteValue);
        System.out.println("My Byte Max Value: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("My Short Min Value: " + myMinShortValue);
        System.out.println("My Short Max Value: " + myMaxShortValue);

        long myLongValue = 100L;
        long bigLongLiteralValue = 2_147_483_647_234L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("My Log Value: " + myLongValue);
        System.out.println("Big Long Literal Value: " + bigLongLiteralValue);
        System.out.println("My Long Min Value: " + myMinLongValue);
        System.out.println("My Long Max Value: " + myMaxLongValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

        System.out.println("My New Byte Value: " + myNewByteValue);
        System.out.println("My New Short Value: " + myNewShortValue);

        float myMinFloatValue = Float.MIN_VALUE;
        double myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("My Min Float Value: " + myMinFloatValue);
        System.out.println("My Max Float Value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("My Min Double Value: " + myMinDoubleValue);
        System.out.println("My Max Double Value: " + myMaxDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3f;
        System.out.println("My Int Value: " + myIntValue);
        System.out.println("My Float Value: " + myFloatValue);
        System.out.println("My Double Value: " + myDoubleValue);

        char myCharValue = 'D';
        boolean isActive = false;
        System.out.println("My Char Value: " + myCharValue);
        System.out.println("Is Active: " + isActive);

        String myString = "This is a string";
        System.out.println("String Value: " + myString);
        myString += ", and this is more." + " \u00A9 2019";
        System.out.println("More: " + myString);

        return gameOver == false;
    }
}
