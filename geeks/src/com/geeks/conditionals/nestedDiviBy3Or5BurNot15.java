package com.geeks.conditionals;
import java.util.Scanner;
/*Q: take positive integer input and tell if it is divisible by 5 or 3 but NOT divisible by 15*/

public class nestedDiviBy3Or5BurNot15 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int i = sc.nextInt();
//        if(i%5 ==0 || i%3==0){
//            if(i%15 != 0){ // if number is NOT divisible by 15;
//                System.out.println("Number is divisible by 3 or 5");
//            }else{ // if it is divisible by 15;
//                System.out.println("Not matching the required condition");
//            }
//        }else {
//            System.out.println("Not matching the required condition");
//        }

        // Doing it without nested ifs
        if((i%3==0 || i%5==0) && i % 15 != 0){
            System.out.println("Num is divisible by 3 or 5 but not 15");
        } else{
            System.out.println("Not matching the required conditions");
        }
    }
}
