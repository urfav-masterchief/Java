package com.geeks.OOPS;

public class RevisionOOPS {

    public static void main(String[] args){
        Pokemon pikachu = new Pokemon(70, "Electric");
        Pokemon jigglypuff = new Pokemon(50, "Fairy");
        pikachu.print(); jigglypuff.print();
//        pikachu.power = 77 ; // then this will give error
//        IO.println(pikachu.getName()); // getting the name of pikachu would give error without this getter method
    }
}
