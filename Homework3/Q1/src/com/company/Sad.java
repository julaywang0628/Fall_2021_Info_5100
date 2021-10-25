package com.company;

public class Sad extends Moody{
    @Override
    public String getMood() {
        return "sad";
    }

    @Override
    public void ExpressFeelings() {
        System.out.println("'waah''boo hoo''weep''sob'");
    }

    public String toString() {
        return "Observation: Subject cries a lot";
    }
}
