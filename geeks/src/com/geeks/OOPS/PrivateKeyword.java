package com.geeks.OOPS;

class CollegeStudents{
    String name;
    int age;
    private int rno;
    private void print(){
        IO.println(name+" "+age+" "+rno);
    }
    public void p(){
        print();
    }
}
public class PrivateKeyword {
    public static void main(String[] args){
     CollegeStudents s = new CollegeStudents();
     s.p();
     s.name = "Shelly";
     s.age = 19;
//     s.rno = 33; gives error since rno is private
     s.p();
    }
}
