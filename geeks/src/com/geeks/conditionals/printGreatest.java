package com.geeks.conditionals;
import java.util.Scanner;
public class printGreatest {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        /*Q:Take 3 positive integers input and print the greatest of them*/

//        System.out.print("Enter the first positive integer: ");
//         int i = sc.nextInt();
//        System.out.print("Enter the second positive integer: ");
//        int j = sc.nextInt();
//        System.out.print("Enter the third positive integer: ");
//        int k = sc.nextInt();
//        if(i>j && i>k){
//            System.out.println(i + " is greatest of the other two");
//        } else if(j>i && j>k){
//            System.out.println(j + " is greatest of the other two");
//        }else if(i==j &&i==j){
//            System.out.println("They are all equal");
//        }
//        else{
//            System.out.println(k + " is greatest of the two");
//        }
        /*HW: if the ages of Ram,Shyam and Ajay are input
        * through the keyboard, write a program to determine the youngest of the three*/
        System.out.print("Enter age of Ram: ");
        int r = sc.nextInt();
        System.out.print("Enter age of Shyam: ");
        int s = sc.nextInt();
        System.out.print("Enter age of Ajay: ");
        int a = sc.nextInt();
        if(r<s && r<a){
            System.out.println("Ram is the youngest as he is " + r+" years old");
        }else if(s<r && s<a){
            System.out.println("Shyam is the youngest as he is " + s);
        } else if (r==s && r==a) {
            System.out.println("They all are of the same age "+ r);
        } else{
            System.out.println("Ajay is the youngest as he is "+ a);
        }
    }
}
