package com.geeks.Array;

public class PassingArrayToMethods {
//    public static void Change(int x){
//        x = 7; // this x is different
//        IO.println(x);  //this will print 7 but this is of this method
//    }
//    public static void main(String[] args){
//      int x = 5;
//        IO.println(x);
//        Change(x); // the value 5 has gone in the method change
//        IO.println(x); // but this will print 5 still, Concept of Pass by value
//    }
        //But for Array
        //Remember that it is passed by reference
    public static void changeArray(int[] master){
        master[2] = 7;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,6,10,8};
        arr[2] = 9;
//        IO.println(arr[2]);
        changeArray(arr);
//        IO.println(arr[2]);

        //Revising swap
        int a = 10; // a is 10
        int b = 5;  // b is 5
        IO.println(a+" "+b); // prints 10 5
        int temp = a; // value of a goes in temp, so temp has 10 now
        a = b; // value of b goes in a, so a is 5 now
        b = temp; // value of temp goes in b, so b is 10 now
        IO.println(a+" "+b);  // prints 5 10
    }
}
