package com.geeks.Array;
import java.util.Scanner;
public class Basics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Array --> Is a Linear data structure


        //Declare and initialize together
//        int[] x = {1,22,42,12,34};
//        System.out.println("Value of arr x at index 2 is: "+x[2]);
//        x[2] = 69;
//        System.out.println("Value of arr x at index 2 after updation is: "+x[2]);

        //Declaring an arr
//        int[] y = new int[2]; // {0,1}
//        System.out.println("Value of arr y at 0th index is: "+y[0]+ " : since we didn't initialize any value to it so the default is 0"); //default is 0
//        System.out.println("Value of arr y at 1st index is: "+y[1]+ " : since we didn't initialize any value to it so the default is 0");
        //Initializing;
//        y[0] = 12;
//        y[1] = 31;
//        System.out.println("After initializing 0th index: "+y[0]);
//        System.out.println("After initializing 1st index:"+y[1]);

        //Printing Output & taking input
//        int[] x = {1,22,42,12,34};
//        int n = x.length;
//        for (int i=0;i<n;i++){ // traversing through the array
//            IO.println(x[i]);
//        }

        //Taking input
        IO.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] x = new int[n];
        //Input
        IO.print("Enter array elements: ");
        for(int i = 0; i<n;i++){
            x[i] = sc.nextInt();
        }
        //Output
        for(int i = 0; i<n;i++){
            IO.print(x[i]+" ");
        }

    }
}
