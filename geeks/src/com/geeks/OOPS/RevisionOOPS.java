package com.geeks.OOPS;
class Pokemon{  // if we had made this in the same public class(RevisionOOPS) we have made, then the private stuff in THIS class wouldn't have been private but a part of that public class' file
//   private int power; //if we do this and make this private  (see line 19)
    int power;
    String type;
    private String name;
    Pokemon(int power, String type, String name){
        this.power = power; // we use the "this" keyword when we're using the same variables which point to 2 different things
        this.type = type;
        this.name = name;
    }
    String getName(){ // this is a getter method used to get private stuff in our files (See line 25)
        return name;
    }
    void print(){  // we can also use methods to print stuff
        IO.println(this.power+" "+this.type);  //we can ofc choose to not use the "this" keyword, but it's better for assurance
    }
}
public class RevisionOOPS {

    public static void main(String[] args){
        Pokemon pikachu = new Pokemon(70, "Electric", "Pikachu");
        Pokemon jigglypuff = new Pokemon(50, "Fairy", "Jigglypuff");
        pikachu.print(); jigglypuff.print();
//        pikachu.power = 77 ; // then this will give error
//        IO.println(pikachu.getName()); // getting the name of pikachu would give error without this getter method
    }
}
