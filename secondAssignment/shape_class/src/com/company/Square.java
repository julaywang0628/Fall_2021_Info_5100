package com.company;

public class Square extends Shape{
    public int side;

    public Square(Integer side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public int getPerimeter() {
        return side * 4;
    }

    public Square(String name, String color, int side) {
        this.name = name;
        this.color = color;
        this.side = side;
    }
}
