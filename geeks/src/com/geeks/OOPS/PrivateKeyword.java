package com.geeks.OOPS;

class CollegeStudents{
    String name;
    int age;
    private int rno;
    public void print(){
        IO.println(name+" "+age+" "+rno);
    }
}
public class PrivateKeyword {
    public static void main(String[] args){
     CollegeStudents s = new CollegeStudents();
     s.print();
     s.name = "Shelly";
     s.age = 19;
//     s.rno = 33; gives error since rno is private
        s.print();
    }
}
