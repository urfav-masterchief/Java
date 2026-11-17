package com.geeks.conditionals;

import java.util.Scanner;

/*Q: take 3 numbers' input and tell if they can be the sides of a triangle*/
//LOGIC: SUM of 2 sides of a triangle is always greater then the third
public class sidesOfATriangle {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        int a = sc.nextInt();
        System.out.print("Enter the second side: ");
        int b = sc.nextInt();
        System.out.print("Enter the third side: ");
        int c = sc.nextInt();
        if((a+b)>c && (a+c)>b && (b+c)>a){
            System.out.println("yes, these can be the sides of a triangle");
        }else{
            System.out.println("no these cannot be the sides of a triangle");
        }
        }
}
