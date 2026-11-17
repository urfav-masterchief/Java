package com.geeks.conditionals;
import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter a number: ");
//        double n = sc.nextDouble(); // n = 3.14
//        int x = (int)n; // x = 3
////        if (n-x  == 0){ // n-x = 3.14 - 3 = 0.14 > 0,
////            // if n ==x i.e 3-3=0, therefore not real
////            System.out.println("is an integer");
////        }else {
////            System.out.println("Not an Integer");
////        }
//
//        if(n-(int)n == 0){
//            System.out.println("Is an Integer");
//        } else{
//            System.out.println("Not an integer");
//        }

        //Q; if cost price and selling price of an item
        // is input through the keyboard, write a program to determine
        // whether the seller has made profit or incurred loss or no profit no loss. Also determine how much profit he mae or loss he incurred

        System.out.print("Enter cost price cp: ");
        int cp = sc.nextInt();
        System.out.print("Enter selling price sp: ");
        int sp = sc.nextInt();

        if(sp>cp){
            int profit = sp-cp;
            double profitPercent= (profit*100.0)/cp;
            System.out.println("Profit of " +profit + " is("+profitPercent +"%)");
        } else if (sp==cp) {
            System.out.println("no prof no loss");
        } else {
            int loss = cp-sp;
            double lossPercent = (loss*100.0)/cp;
            System.out.println("Profit of " +loss + " is("+lossPercent +"%)");
        }




    }
}
