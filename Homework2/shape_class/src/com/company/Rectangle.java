package com.company;

public class Rectangle extends Shape {
    int width;
    int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle(int side) {
        super();
        this.width = side;
        this.height = side;
    }

    @Override
    public int getArea() {
        return width * height;
    }

    @Override
    public int getPerimeter() {
        return (width + height) * 2;
    }

    public Rectangle(String shapeName, String color, int width, int height) {
        super(shapeName, color);
        this.width = width;
        this.height = height;
    }
}
