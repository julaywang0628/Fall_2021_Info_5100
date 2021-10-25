package com.company;

public class Happy extends Moody{
    @Override
    public String getMood() {
        return "happy";
    }

    @Override
    public void ExpressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    public String toString() {
        return "Observation: Subject laughs a lot";
    }
}
