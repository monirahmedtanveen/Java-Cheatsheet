package com.monirtanveen.unit2;

public class ThisReferenceExample {

    public void doProcess(int i, Process p) {
        p.process(i);
    }

    public void execute() {
        doProcess(10, i -> {
            System.out.println("Value of i from execute is " + i);
            System.out.println(this);
        });
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

        // Classic Way
        thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("Value of i is " + i);
                System.out.println(this);
            }

            @Override
            public String toString() {
                return "This is the anonymous inner class";
            }
        });

        // Lambda Way
        thisReferenceExample.doProcess(10, i -> {
            System.out.println("Value of i from lambda is " + i);
            // System.out.println(this); This will not work
        });

        // From execute function
        thisReferenceExample.execute();
    }

    @Override
    public String toString() {
        return "This is thisReferenceExample class";
    }
}
