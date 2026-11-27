package com.geeks.OOPS;

class Cricketer{
    //static variables means shareable variables
    static String country;
    String name;
    int avg;
    int runs;
    Cricketer(){

    }
}
public class FinalAndStatic {
    public static void main(String[] args){
        Cricketer c1 = new Cricketer();
        Cricketer c2 = new Cricketer();
        c1.country = "Australia"; // we put this
        IO.println(c2.country); // and print c2, and Australia gets printed
    }
}
