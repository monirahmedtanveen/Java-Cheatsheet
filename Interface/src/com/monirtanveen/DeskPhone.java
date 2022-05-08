package com.monirtanveen;

public class DeskPhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action needed. Desk phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on desk phone");
    }

    @Override
    public void answer() {
        if (this.isRinging) {
            System.out.println("Answering the phone");
            this.isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            this.isRinging = true;
            System.out.println("Ring ring");
        } else {
            this.isRinging = false;
        }

        return this.isRinging;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
