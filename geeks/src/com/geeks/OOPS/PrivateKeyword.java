package com.geeks.OOPS;

class CollegeStudents{
    String name;
    int age;
    private int rno;
    void print(){ // this is a Getter
        IO.println(name+" "+age+" "+rno);
    }
    int getRno(){  // getter
        return rno;
    }
    int setRno(int x){ // setter
        return x;
    }
}
public class PrivateKeyword {
    public static void main(String[] args){
     CollegeStudents s = new CollegeStudents();
     s.name = "Shelly";
     s.age = 19;
//     s.rno = 33; gives error since rno is private
        //but
        s.setRno(13);
        IO.println(s.getRno());
    }
}
