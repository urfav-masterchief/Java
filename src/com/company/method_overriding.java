package com.company;

class A{
    public int a;
    public int meth1(int a){
        return 7;
    }
    public void meth2(){
        System.out.println("Meth2 from class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("Meth2 from class B");
    }
    public void meth3(){
        System.out.println("Meth3 from class B");
    }
}
public class method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
//        b.meth3();
        b.meth2();
    }
}
