package com.company;

public class Main {

    public static void main(String[] args) {
        Moody happy = new Happy();
        Moody sad = new Sad();

        Psychiatrist.examine(happy);
        Psychiatrist.observe(happy);

        Psychiatrist.examine(sad);
        Psychiatrist.observe(sad);
    }
}
