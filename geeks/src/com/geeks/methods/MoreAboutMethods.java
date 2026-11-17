package com.geeks.methods;
import java.util.Scanner;
public class MoreAboutMethods {

    public static void name(){
        System.out.println("What's your name?");
    }
    public static void greet(String a){
        System.out.println("Hi " +a+", you have an amazing name!! ");
    }

    public static void sum(int a,int b){
        System.out.println("Sum of "+a+" + "+b+ " is "+ (a+b));
        int x= a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        name();
        String a = sc.nextLine();
        greet(a);
        sum(2,8);
    }
}
