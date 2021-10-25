package com.company;

public class Shape {
    public String name;
    public String color;
    private int area;
    private int perimeter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public Shape(){

    }

    public int getArea() {
        return area;
    }

    public int getPerimeter() {
        return perimeter;
    }


    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Shape(String name, String color, int perimeter, int area) {
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    public String printShape() {
        return "The " + this.name + " has a " + this.color + " color";
    }
}
