package com.company;
//Q1-Create a class Cylinder & use getters and setters to set its height
class Cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    //Q2- Use Q1 to calculate surface area and volume of the cylinder
    public double surfaceArea(){
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }

//    Q3- use a constructor and repeat 1

    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }
}
/*Q4- overload a constructor used to initialize a rectangle of length 4 and 5 for using custom parameters */
class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
//Q5- Repeat 1 for a sphere

class Sphere{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

public class Access_Modifiers_And_Constructors_Excersize{
    public static void main() {
//        A1
//        Cylinder myCylinder = new Cylinder();
      Cylinder myCylinder = new Cylinder(12, 9); //----------->> This is for constructor
//        myCylinder.setHeight(12);
//        myCylinder.setRadius(9);
        System.out.println(myCylinder.getHeight());
        System.out.println(myCylinder.getRadius());
//        A2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
//      A3 and 4
        Rectangle rect = new Rectangle();
        System.out.println(rect.getBreadth());
        System.out.println(rect.getLength());
//      A5

        Sphere sphere = new Sphere();
        sphere.setHeight(12);
        sphere.setRadius(9);
        System.out.println(sphere.getHeight());
        System.out.println(sphere.getRadius());
    }
}