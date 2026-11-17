package com.geeks.conditionals;
import java.util.Scanner;
/*Q: Take positive integer input and tell if it is a three-digit number or not*/
public class threeDigitNumber {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int i = sc.nextInt();
        if (i>99 && i<1000){
            System.out.println("3 digits, nice");
        } else if(i<100 && i>9){
            System.out.println("2 digits");
        }else{
            System.out.println("that's a one digit");
        }
    }
}
