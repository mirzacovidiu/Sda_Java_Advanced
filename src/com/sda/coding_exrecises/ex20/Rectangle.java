package com.sda.coding_exrecises.ex20;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this. width = width;
    }

    @Override
    double calculatePerimeter() {
      return (length+width)*2;
    }

    @Override
    double calculateArea() {
        return length* width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
