package com.geeks.OOPS;

class CollegeStudents{
    String name;
    int age;
    private int rno;
}
public class PrivateKeyword {
    public static void main(String[] args){
     CollegeStudents s = new CollegeStudents();
     s.name = "Shelly";
     s.age = 19;
//     s.rno = 33; gives error since rno is private
        IO.println(s.rno);
    }
}
