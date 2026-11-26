package com.geeks.OOPS;

public class Constructors {
    public static class Car{
        String name;
        int seats;
        double torque;
        //Constructor overloading
        Car(){ //Default constructor

        }
        Car(String n, int s, double t){
            name = n;
            seats = s;
            torque = t;
        }
        void printInfo(){
            IO.println(name+" "+seats+"seats "+torque+"Nm torque");
        }
    }
    public static void main(String[] args){
//     Car c = new Car(); // Default constructor, () is a method call
        Car c1 = new Car("Bugatti", 4, 5.3);
        c1.printInfo();
        Car c2 = new Car("Lamborghini", 4, 5.1);
        c2.printInfo();

        Car c3 = new Car(); // This only works since we have a non parameterized constructor as well, otherwise it wouldn't have worked

    }
}
