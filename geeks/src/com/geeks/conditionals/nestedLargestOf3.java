package com.geeks.conditionals;
import java.util.Scanner;

public class nestedLargestOf3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st num: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd num: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd num: ");
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a + " is largest of the three");
            }else{
                System.out.println(c + " is largest of the three");
            }
        }else{
            if(b>a){
                if(b>c){
                    System.out.println(b + " is largest");
                } else{
                    System.out.println(c + " is largest of the three");
                }
            }else{
                System.out.println(a + " is largest of the three");
            }
        }
    }
}
