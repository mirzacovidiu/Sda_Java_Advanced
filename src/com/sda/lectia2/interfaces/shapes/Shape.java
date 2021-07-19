package com.sda.lectia2.interfaces.shapes;

public interface Shape {

    double getArea();
    double getPerimeter();
    default void print(){
        System.out.println("Shape: " + this);
    }
}
