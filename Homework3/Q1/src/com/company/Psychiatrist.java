package com.company;

public class Psychiatrist {
    public static void examine(Moody moodyObject) {
        System.out.println("How are you feeling today?");
        moodyObject.queryMood(moodyObject.getMood());
    }

    public static void observe(Moody moodyObject) {
        moodyObject.ExpressFeelings();
        System.out.println(moodyObject.toString());
    }

}
