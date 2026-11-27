package com.geeks.OOPS;

class Cricketer{
    final String country = "New Zealand"; // now this is a finalized/immutable value we have set using the final keyword so this CANNOT be changed further like "country = 'x'" etc
    String name;
    int avg;
    int runs;
    Cricketer(){

    }
}
public class FinalAndStatic {
    public static void main(String[] args){
        Cricketer c1 = new Cricketer();
        IO.println(c1.country);
    }
}
