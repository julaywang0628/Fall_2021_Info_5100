package com.Northeastern.Zhilei.CarDesign;

public class LuxuryCar extends CarDecorator{
    public LuxuryCar(Car car) {
        super(car);
    }
    @Override
    public void assemble() {
        System.out.print("Adding features of LuxuryCar. ");
    }
}
