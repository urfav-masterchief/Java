package com.geeks.methods;
import java.util.Scanner;

public class builtInLibraries {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter a: ");
//    int a = sc.nextInt();
//    System.out.println("Enter b: ");
//    int b = sc.nextInt();
//    int pow = 1;
//    for (int i=1; i<=b;i++){
//        pow = pow * a;
//    }
//        System.out.println(pow);

        //OR
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        System.out.println(Math.pow(a,b)); //Math.pow() is a built-in library function

        //Some more library functions
//        System.out.println(Math.sqrt(16));
//        System.out.println(Math.cbrt(8)); //cbrt= cube root
//        System.out.println(Math.abs(-6)); //absolute value
//        System.out.println(Math.floor(3.14)); //Greatest integer function
//        System.out.println(Math.max(4,8)); //Maximum value will be printed
//        System.out.println(Math.min(0.6,4.6)); //Minimum value // // //

      //Q:Take 4 no.s input and print greatest of them using built-in functions, in one line
        IO.print("Enter a: ");
        int a = sc.nextInt();
        IO.print("Enter b: ");
        int b = sc.nextInt();
        IO.print("Enter c: ");
        int c = sc.nextInt();
        IO.print("Enter d: ");
        int d = sc.nextInt();
        System.out.println(Math.max(a, Math.max(b,Math.max(c,d))));

    }
}

