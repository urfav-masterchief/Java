package com.geeks.OOPS;

public class PolyMorphism { // Ek naam many kaam
    public static class Lion{
        void speak(){ // we didn't use public static for this method because we have its class witht hat already
            IO.println("GRRRRRRRR");
        }
    }
    public static class Cat{
        void speak(){
            IO.println("Meow");
        }
    }
    public static class Human{
        void speak(){
            IO.println("Hey");
        }
    }
    public static class Dog{
        void speak(){
            IO.println("bark");
        }
    }
    public static void main(String[] args){
            Human Bianca = new Human();
            Cat batman = new Cat();
            Dog Maya = new Dog();
            Lion Simba = new Lion();

            Bianca.speak();
            batman.speak();
            Maya.speak();
            Simba.speak();
    }
}
