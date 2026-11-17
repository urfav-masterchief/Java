package com.company;

class Phone{
    public void showTime(){
        System.out.println("Its is 9 pm");
    }
    public void on(){
        System.out.println("Turning on phone...");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    @Override
    public void on(){
        System.out.println("Turning on smartphone...");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhone(); // Super class ka REFRENCE barabar ho sakta hai Subclass k Object k, NOT VICE VERSA
//      SmartPhone smobj = new Phone(); // Not allowed
        obj.showTime();
        obj.on();
       // obj.music(); // not allowed
        SmartPhone kew = new SmartPhone();
                kew.music();
    }
}
