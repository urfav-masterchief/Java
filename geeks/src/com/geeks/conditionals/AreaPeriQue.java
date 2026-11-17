package com.geeks.conditionals;
import java.util.Scanner;
/*Given the length and breadth of a rectangle,
* write a program to find whether the area of the rectangle is greater than
* its perimeter.*/
public class AreaPeriQue {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter breadth of rect: ");
        int breadth = sc.nextInt();
        System.out.print("Enter length of rect: ");
        int length = sc.nextInt();
        int area = length*breadth;
        int perimeter = 2*(length+breadth);
        if(area>perimeter){
            System.out.println("Area is greater than perimeter, and it is " + area);
        }else if(area == perimeter){
            System.out.println("Square");
        }else{
            System.out.println("Perimeter is greater as it is "+ perimeter);
        }
        }
}
