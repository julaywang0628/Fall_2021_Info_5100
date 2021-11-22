package com.Northeastern.Zhilei.CarDesign;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        System.out.println();

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
