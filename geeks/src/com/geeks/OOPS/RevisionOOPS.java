package com.geeks.OOPS;

public class RevisionOOPS {
    private static class Pokemon{
        int hp;
        int attack;
        int defense;
        String type;
        String name;
    }
    public static void main(String[] args){
        Pokemon p1 = new Pokemon();
        p1.name = "Pikachu"; p1.type = "Electric"; p1.attack = 70;

        Pokemon p2 = new Pokemon();
        p2.name = "Charizard"; p2.type = "Fire"; p2.attack = 110;

        Pokemon p3 = p1; // This means p3 is shallow copy of p1 (p3 can control p1)
        p3.type = "Water"; // So we put p3 as Water type
        IO.println(p1.type); // and printed p1's type, which was then converted to water, as p1 is a shallow copy of p3 // i.e, it can be controlled by p3
    }
}
