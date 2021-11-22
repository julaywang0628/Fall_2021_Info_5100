package com.Northeastern.Zhilei.CarDesign;

public class CarDecorator implements Car{
    protected Car basicCar = null;
    public CarDecorator(Car car) {
        basicCar = car;
        car.assemble();
    }

    @Override
    public void assemble() {

    }


}
