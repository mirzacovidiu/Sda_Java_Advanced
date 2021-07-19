package com.sda.lectia2.interfaces.shapes;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(5, 5);
        shapes[1] = new Rectangle(77, 3);

        Shape shapeWithMaxArea = shapes[0];

        for (Shape shape : shapes){

            if(shape.getArea() > shapeWithMaxArea.getArea())
            {
                shapeWithMaxArea = shape;
            }
        }
  //      Rectangle myRectangle = new Rectangle(4, 5);
        System.out.println(shapeWithMaxArea.getArea());
        System.out.println(shapeWithMaxArea.getPerimeter());
        shapeWithMaxArea.print();
    }
   /* public <T extends Comparable<T>> void compareTwoObjecs(Rectangle obj1, Rectangle obj2){
        if(obj1.compareTo(obj2) == 0){
            System.out.println("ARE EQUAL");
        }*/
    }

