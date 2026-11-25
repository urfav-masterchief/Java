package com.geeks.OOPS;

class Student{ //Blueprint Datatype
    String name;
    int rno;
    int age;
}
public class UserDefinedDatatypes {
    public static void main(String[] args){
        Student student = new Student(); // Object creation, Object are real world entities
        student.age = 19;
        student.name = "Riley Reeds";
        student.rno = 33;
        IO.println(student.name +" "+ student.age);
    }
}
