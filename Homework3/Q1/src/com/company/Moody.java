package com.company;

public abstract class Moody {
    String mood;
    abstract String getMood();
    abstract void ExpressFeelings();

    public void queryMood(String mood) {
        this.mood = mood;
        System.out.println("I feel " + mood + " today!");
    }

}
