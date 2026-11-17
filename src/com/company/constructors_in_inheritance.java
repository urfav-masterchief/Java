package com.company;

class Base1{
    Base1(){
        System.out.println("Im a constructor from Base1 class");
    }
    Base1(int x){
        System.out.println("im an overloaded constructor of Base1 class with a value of x as: " + x);
    }
}

class Derived1 extends Base1{
   Derived1(){
      // super(0); //this will call the overloaded constructor from parent class which has an argument
       System.out.println("Im a constructor from Derived1 class");
   }
   Derived1(int x, int y){
       super(x);
       System.out.println("im an overloaded constructor of Derived1 class with value of y as: " + y);

   }
}
public class constructors_in_inheritance {
    public static void main(String[] args) {

//        Base1 b = new Base1();
//        Derived1 d = new Derived1();
          Derived1 d = new Derived1(9, 99);

    }
}
