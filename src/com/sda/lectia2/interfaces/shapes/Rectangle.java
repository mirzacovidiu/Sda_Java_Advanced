package com.sda.lectia2.interfaces.shapes;

public class Rectangle implements Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;

    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter(){
        return 2 * a + 2 * b;
    }
    @Override
    public void print() {
        System.out.println("Rectangle: " + this);}}

/*    @Override
    public int compareTo(Rectangle 0)
  {return 0;}
*
}
/**/
