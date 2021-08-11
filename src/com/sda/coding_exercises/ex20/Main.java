package com.sda.coding_exercises.ex20;

//Create an abstract Shape class with the abstract methods calculatePerimeter() for calculating the
//        perimeter and calculateArea() for calculating the area.
//        Create Rectangle, Triangle, Hexagon classes, extending the Shape class, and implementing abstract methods accordingly. Verify the solution correctness.

public class Main {
    public static void main(String[] args) {

        Shape triangle = new Triangle(29,34, 10);
        Shape rectangle = new Rectangle(23,14);

        System.out.println("The perimeter of triangle is: " + triangle.calculatePerimeter()+ " cm");
        System.out.println("The area of triangle is: " + triangle.calculateArea());
        System.out.println("===================");
        System.out.println("The perimeter of rectangle is: " + rectangle.calculatePerimeter());
        System.out.println("The area of rectangle is: " + rectangle.calculateArea());


    }
}
