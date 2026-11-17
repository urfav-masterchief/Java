package com.geeks.conditionals;
import java.util.Scanner;
/*Q: take a positive integer input and tell if it is divisible by 5 and 6*/
public class Divisible_by_5and3 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int i = sc.nextInt();
//        if(i%5 == 0 && i%3 ==0){
//            System.out.println("number is divisible by 5 and 3");
//        } else{
//            System.out.println("number is not divisible by 3 and 5");
//        }
        //Q2; '' ... and tell if it is divisible by 5 or 3
        if(i%5==0 || i%3==0){
            System.out.println("divisible by 3 or 5");
        } else{
            System.out.println("not divisible by 3 or 5");
        }
    }
}
