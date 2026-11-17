package com.company;
/*
    Abstract method:
    a method that's declared without an implementation
 */

abstract class Parent{
    public Parent(){
        System.out.println("hey");
    }
    public void lala(){
        System.out.println("hey");
    }
    abstract void greet();
}
class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("GM");
    }
}
abstract class Child2 extends Parent{
    public void ur(){
        System.out.println("Im good");
    }
}
public class abstract_interface {
    public static void main(String[] args){

        Child c = new Child(); // object of Child class can be created because it is a concrete class
        //unlike Parent which is an abstract class
        // An Object of abstract class CANNOT be created
//        Parent p = new Parent();
        // that gave an error, so will Child2
//        Child2 C2 = new Child2();
        

class nbai{
    private int j;

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}
    }
}
