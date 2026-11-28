package com.geeks.OOPS;
class Pokemon{ // Parent/Super class
    int power;
    String type;
    private String name;
    Pokemon(int power, String type){
        this.power = power;
        this.type = type;
    }
    String getName(){ // this is a getter method used to get private stuff in our files (See line 25)
        return name;
    }
    void print(){
        IO.println(this.power+" "+this.type);
    }
    Pokemon(){

    }
}
class LegendaryPokemon extends Pokemon{ // child/derived/sub class
    String ability;

}
public class Inheritance {
    public static void main(String[] args){
        LegendaryPokemon Mewtwo = new LegendaryPokemon();
        Mewtwo.ability = "Pressure";
        Pokemon Pikachu = new Pokemon();
//        Pikachu.ability  -- GIVES ERROR
    }
}
