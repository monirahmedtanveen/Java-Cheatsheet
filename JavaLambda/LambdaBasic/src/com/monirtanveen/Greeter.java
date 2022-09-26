package com.monirtanveen;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        Greeting helloWorldGreeting = new HelloWorldGreeting();
        Greeting lambdaGreeting = () -> System.out.println("Lambda Greeting!");

        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Inner Class Greeting!");
            }
        };

        helloWorldGreeting.perform();
        innerClassGreeting.perform();
        lambdaGreeting.perform();

        greeter.greet(helloWorldGreeting);
        greeter.greet(lambdaGreeting);
        greeter.greet(innerClassGreeting);

        greeter.greet(() -> System.out.println("Lambda Greeting!"));
    }
}
