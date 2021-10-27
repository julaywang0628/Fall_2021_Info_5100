package com.company;

public class Printer {
    private Printer(){}
    private static Printer instance;
    private static Object obj = new Object();

    public static Printer getInstance() {
        if(instance == null) {
            synchronized (obj) {
                if(instance == null) {
                    return new Printer();
                }
            }
        }
        return instance;
    }

    public String getConnection() {
        return "Your Printer is working";
    }
}
