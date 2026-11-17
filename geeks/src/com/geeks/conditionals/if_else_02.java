package com.geeks.conditionals;
import java.util.Scanner;

public class if_else_02 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a positive integer: "); // tell if its even or odd
//        int n = sc.nextInt();
//        if (n%2==0){
//            System.out.println("Very good, that's even");
//        } else{
//            System.out.println("now THATS odd");
//        }
        // now tell if its divisible by 5
        System.out.print("Enter a positive integer divisible by 5: ");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println("ok");
        }else {
            System.out.println("wtf");
        }
    }
}
