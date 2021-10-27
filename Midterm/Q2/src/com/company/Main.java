package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer p1 = Printer.getInstance();
        System.out.println(p1.getConnection());
    }
}
