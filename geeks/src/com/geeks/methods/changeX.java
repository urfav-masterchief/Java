package com.geeks.methods;

public class changeX {
    public static void change(int x){
        x = 20;
        System.out.println(x);
    }
    public static void main(String[] args){
    int x = 10;
        System.out.println(10);
        change(x);
        System.out.println(x);
    }
}
