package com.geeks.OOPS;


public class PassingObjectsToMethods {
public static class Car{
        String name;
        int seats;
        int torque;
        String type;

        //Creating a method for all this info
    void print(){
        IO.println(name+" "+seats+" seats "+torque+"Nm torque "+type);
    }
    }
    public static void main(String[] args){
//     Student s = new Student(); // So we can use  the Student class we created as well as long aas it is in the same package/folder
        
        Car c = new Car();
        c.name = "Kia Sonnet";
        c.seats = 6;
        c.torque = 178;
        c.type = "SUV";
        
        change(c);
        IO.println(c.seats);

        c.print();

    }

    private static void change(Car x) { //This implies: that when we pass objects to methods they are passed by reference
        x.seats = 5;
    }
}
