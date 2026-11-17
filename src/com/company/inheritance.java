package com.company;
// Inheritance is used to borrow properties and methods from an existing class
class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am setting x now");
        this.x = x;
    }
}

class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class inheritance {
    public static void main(String[] args){

        Derived b = new Derived(); // creating object of Derived tho setX/getX are from Base

        b.setX(69);
        System.out.println(b.getX());

    }
}
