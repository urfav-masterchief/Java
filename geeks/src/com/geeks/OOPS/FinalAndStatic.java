package com.geeks.OOPS;

class Cricketer{
    //static variables means shareable variables
    static String country = "NZ"; // we can also put final static for an immutable object, static is just good for the memory and uses less space
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
        IO.println(c2.country); // and print c2, and Australia gets printed EVEN THO WE SET country AS NZ IN THE CLASS THIS TIME
        // see screenshot more info

//        fun(); // this is giving error that non-static method cannot be referenced from a static context
    }
    private void fun(){ // we didn't use static here. see line 21
        IO.println("Yo waz good");
    }
}
