package com.company;
//Q1- create a circle class and use inheritance to create a cylinder class from it
class Circle{
    public int radius;

        Circle(){
            System.out.println("Circle non param cons");
        }
        Circle(int r){
            this.radius= r;
            System.out.println("Circle param cons");
        }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle{
    public int height;

    Cylinder1(int r, int h){
        System.out.println("Im cylinder's parameterised cons");
        super(r); // if we don't use this, the non PARAMETERISED constructor of circle will run
        this.height = h;
    }

    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class inheritance_practice_set {
    public static void main(String[] args){
    Circle objC = new Cylinder1(2, 5);

    }
}
