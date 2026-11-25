package com.geeks.OOPS;

class Car{
    String name;
    int seats;
    int torque;
        }
public class PassingObjectsToMethods {
    public static void main(String[] args){
//     Student s = new Student(); // So we can use  the Student class we created as well as long aas it is in the same package/folder
        
        Car c = new Car();
        c.name = "Kia Sonnet";
        c.seats = 6;
        c.torque = 178;
        
        change(c);
        IO.println(c.seats);
    }

    private static void change(Car c) {
        c.seats = 5;
    }
}
