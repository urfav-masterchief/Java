package com.geeks.loops;
import java.util.Scanner;
public class APandMath {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //Q:Display this AP - 1,3,5,7,9... upto 'n'
        // an = a+(n-1)*d {Where: an= nth term, a= first term, n is number of terms, d is common difference}
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        int a=1;
//        int d = 2;
//        int an = a +(n-1)*d; // an = 2*n-1
//
//        for(a =1; a<=an; a=a+2){
//            System.out.println(a);
//        }

        //Another way
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        for (int i = 1; i<=2*n-1;i+=2){
//            System.out.print(i+" ");
//        }

        //Q:Display this AP - 4,7,10,13,16.. up-to 'n' terms.
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        //CALCULATION
//        int a = 4;
//        int d = 3;
//        int an = a + (n-1)*d; // an = 4 + (n-1)3= 3n +1
//        for(a = 4; a<=3*n+1; a=a+3){
//            System.out.println(a);
//        }

        //Making a code for any ap
//        System.out.print("Enter nth term(number of terms): ");
//        int n = sc.nextInt();
//        System.out.print("Enter a (first term): ");
//        int a = sc.nextInt();
//        System.out.print("Enter d (Common difference): ");
//        int d = sc.nextInt();
//        int an = a + (n-1)*d;
//        for(a = a; a<=an; a= a+d){
//            System.out.println(a);
//        }

        //Q: Display this GP - 1,2,4,8,16,32... up-to 'n' terms.
        //Common ratio - 2
        //Method 1; =====> FAILED
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        System.out.print("Enter a: ");
//        int a = sc.nextInt();
//        System.out.print("Enter r (common ratio): ");
//        int r = sc.nextInt();
//        int an = a*r^(n-1);
//        for(a=a; a<=an; a= a+r){
//            System.out.println(a);
//        }

        //Method-2;
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        int a = 1, r=2;
//        for(int i = 1; i<= n; i++) {
//            System.out.println(a);
//            a = a*r;
//        }
    }
}
