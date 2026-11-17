package com.company;

class EkClass{
    int a;

    public int getA() {
        return a;
    }

    EkClass(int v){
        this.a = v;
    }

    public int returnOne(){
        return 1;
    }
}
class DoClass extends EkClass{
    // super (c); cant do this here
    DoClass(int c){
        super(c); // this is required to run this constructor, otherwise this class will look for a default constructor to run from inheritor class
        System.out.println("Constructor from DoClass");
    }
}
public class this_super {
  public static void main(String[] args) {

        EkClass e = new EkClass(5);
      System.out.println(e.getA());
    }
}
