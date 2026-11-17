package com.geeks.methods;
import java.util.Scanner;
public class returnType {



//    public static int sum(int a, int b){
//        return a+b;
//    }


    public static int fact(int x){
        int xfact = 1;
        for(int i =1; i<=x;i++){
            xfact = xfact*i;
        }
        return xfact;
    }



    public static void main(String[] args){
//        System.out.println(sum(9,45));

        Scanner sc = new Scanner(System.in);

        //Combination and permutation


        //WITHOUT FACT METHOD
        //Combination: nCr (n C k upar hai) = n!/r!*(n-r)!
//        int n = sc.nextInt();
//        int r = sc.nextInt();
//        int nfact = 1;
//        for(int i =1; i<=n;i++){
//            nfact = nfact*i;
//        }
//        int rfact = 1;
//        for(int i =1; i<=r; i++){
//            rfact = rfact*i;
//        }
//        int nmrfact = 1;
//        for(int i=1;i<=(n-r);i++){
//            nmrfact = nmrfact * i;
//        }
//        int ncr = nfact/(rfact*nmrfact);  //NEVER forget the brackets below /
//
//        System.out.println(ncr);



        //USING FACT METHOD
        int n = sc.nextInt();
        int r = sc.nextInt();
        int ncr = fact(n)/(fact(r)*fact(n-r));
        int npr = fact(n)/fact(n-r);
        System.out.println("NCR is: "+ncr);
        System.out.println("NPR is: "+ npr);

    }
}
