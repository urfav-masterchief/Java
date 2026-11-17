package com.geeks.loops;
import java.util.Scanner;
public class loopsBasics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        for (int i=1; i<=10;i++){ //i++ means i= i+1
//            System.out.println(i);
//        }


        //Declaring i outside the loop to call it and see the output afterwards

//        System.out.print("Enter no. : ");
//        int n = sc.nextInt();
//        int i;
//        for(i = 1; i<=n; i++){
//            System.out.println(i);
//        }
//        System.out.println(i);

//        //Q: print nums from 1 to 10
//        for(int i = 1; i<=10;i=i+1){
//            System.out.println(i);
//        }

        //Q:Print nums from 1 to n
//        System.out.print("Enter n : ");
//        int n = sc.nextInt();
//        for(int i = 1; i<=n; i=i+1){
//            System.out.println(i);
//        }

        //Q:Prints nums from i to n
//        System.out.print("Enter i: ");
//        int i = sc.nextInt();
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        for(i=i; i<=n; i++){
//            System.out.println(i);
//        }

        //Q:Print all even numbers from 1 to 100
//        for(int i = 2; i<=100; i= i+2){
//            System.out.println(i);
//        }

        //Same ques using ifs
//        for(int i = 1; i<=100; i++){
//            if(i%2 == 0){
//                System.out.println(i);
//            }

        //Q; Print all the odd nums from 1-100 which are divisible by 3
//        for(int i=1;i<=100;i++){
//            if(i%3==0){
//                System.out.println(i);
//            }

//        //Q;Print table of 19 //This code is better
//        for(int i=19;i<=190;i=i+19){
//            System.out.println(i);
//        }

        //Same using if else
//        for(int i=1;i<=190;i=i+1){
//            if(i%19==0){
//                System.out.println(i);
//            }
//        }


        //Q:Print the table of 'n'.Here 'n' is an integer which user will input
//        System.out.print("Enter the number of whose table you want to print: ");
//        int n = sc.nextInt();
//        for(int i=n; i<=n*10;i=i+n){
//            System.out.println(i);
//        }

        //Q:Print nums from 10 to 1
//        for(int i = 10; i>=1; i--){
//            System.out.println(i);
//        }

        //Q:Print nums from 100 in decreasing order divisible by 3
        for(int i=99; i>=1; i=i-3){
            System.out.println(i);
        }

    }
}
