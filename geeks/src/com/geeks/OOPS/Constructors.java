package com.geeks.OOPS;

public class Constructors {
    public static class Car{
        String name;
        int seats;
        double torque;
        //Constructor overloading
        //Order of parameters Matters In Methods/Constructors
        Car(){ //Default constructor

        }
        Car(String name, int seats, double torque){
            name = name;  // When we do this, the compiler(or sum) gets confused and returns 0 and null
            seats = seats; // NOT error tho, but null
            torque = torque;
        }
        Car(int s, double t, String n){

        }
        void printInfo(){
            IO.println(name+" "+seats+"seats "+torque+"Nm torque");
        }
    }
    public static void main(String[] args){
//     Car c = new Car(); // Default constructor, () is a method call
        Car c1 = new Car("Bugatti", 4, 5.3);
        c1.printInfo();
        Car c2 = new Car( 4, 5.1,"Lamborghini"); // This only runs because we have a constructor of the same order of datatypes in the parameters
        c2.printInfo();

        Car c3 = new Car(); // This only works since we have a non parameterized constructor as well, otherwise it wouldn't have worked

    }
}
