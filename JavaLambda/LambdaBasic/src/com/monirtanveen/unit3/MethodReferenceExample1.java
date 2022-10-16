package com.monirtanveen.unit3;

public class MethodReferenceExample1 {

    public static void main(String[] args) {
        Thread t = new Thread(MethodReferenceExample1::printMessage); // MethodReferenceExample1::printMessage === () -> printMessage()  // Both Are Same. Its a method reference
        t.start();
    }

    public static void printMessage() {
        System.out.println("Hello World");
    }
}
