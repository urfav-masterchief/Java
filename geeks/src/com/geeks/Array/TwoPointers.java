package com.geeks.Array;

public class TwoPointers {
    public static void print(int[] arr){
        for (int i=0;i<arr.length;i++){
            IO.print(arr[i]+" ");
        }
        IO.println();
    }
    public static void main(String[] args){
        //Q:Write a program to reverse an array without using any extra array(Two pointers)
        //Two pointer--> two variable technique

        int[] arr = {4,6,2,1,7,12,35};
        int n = arr.length;
        print(arr);

        int i=0; int j=n-1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        print(arr);

    }
}
