package com.geeks.OOPS;

public class UserDefinedDatatypes {
    public static class Student{ //Blueprint datatype
        String name;
        int rno;
        int age;
    }
    public static void main(String[] args){
        Student student = new Student(); // Object creation
        student.age = 19;
        student.name = "Riley Reeds";
        student.rno = 33;
        IO.println(student.name +" "+ student.age);
    }
}
