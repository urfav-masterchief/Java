package com.geeks.OOPS;
// ALL THIS PROCESS OF ACCESSING STUFF WITH PRIVATE KEYWORD
// IS CALLED
// ENCAPSULATION
class CollegeStudents{
    String name;
    private int age;
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
    int setAge(int y){
        return y;
    }
}
public class PrivateKeyword {
    public static void main(String[] args){
     CollegeStudents s = new CollegeStudents();
     s.name = "Shelly";
     s.setAge(19);
//     s.rno = 33; gives error since rno is private
        //but
        s.setRno(13);
        IO.println(s.getRno());
    }
}
