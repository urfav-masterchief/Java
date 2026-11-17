package com.geeks.loops;
import java.util.Scanner;
public class ContinueStatement {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //Continue statement: Skip an iteration(Round) in a loop
//        for(int i=1; i<=100; i++){
//            if(i==18 || i==22)continue;
//            if(i%2==0 || i%3==0){
//                System.out.println(i);
//            }
//        }

        //Printing all even nums to 100 using another method
//        for (int i = 1; i <=100; i++) {
//            System.out.print("Hello");
////            if (i%2!=0) continue; //What continue does is it sends us to the next round and what is below won't be printed
//            System.out.println(i);
//        }

        //Matlab, continue ke BAAD jo bhi aayega wo skip hoga

        //LATER
        //Q:WAP to print odd nums from 1 to 100
        for(int i =1; i<=100; i++){
            if(i%3!=1)continue;
            System.out.println(i);
        }
    }
}
