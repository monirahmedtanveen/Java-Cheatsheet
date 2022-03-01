package com.monirtanveen;

public class Main {

    public static void main(String[] args) {
	    Calculator calc = new Calculator();
        calc.setFirstNumber(5);
        calc.setSecondNumber(2);

        System.out.println("Addition Result: " + calc.getAdditionResult());
        System.out.println("Subtraction Result: " + calc.getSubtractionResult());
        System.out.println("Multiplication Result: " + calc.getMultiplicationResult());
        System.out.println("Division Result: " + calc.getDivisionResult());
        System.out.println("Division Result: " + calc.getModResult());
    }
}
