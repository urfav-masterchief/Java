package com.geeks.loops;
import java.util.Scanner;
public class BreakStatement {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //Q:WAP to find the highest factor of a number 'n'(other than n itself)
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        /*For eg, if n = 60
//        * facotrs of 60: 1,2,3,4,5,6,10,12,15,20,30,60
//        * but largets factor of 60 other than n which is 60 itself is 30*/
//        int hf = 1;
//        for(int i= 1; i<n; i++){
//            if(n%i==0){
//            hf = i;
//            }
//        }
//        System.out.println(hf);

        //using break and from reverse we're gonna print
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        int hf = 1;
//        for(int i = n-1; i>=1; i--){
//            if(n%i==0){
//                hf = i;
//                break;
//            }
//        }
//        System.out.println(hf);

        //Q:WAP to check if a number is prime or not.
        /*For any no. 'n', if the factors are 1 and n only the no. is prime, except 1.
        * for composite no. : when it has >=3 factors*/
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        boolean flag =false; //here, false means prime;
//        for(int i =2; i<Math.sqrt(n); i++){ // or i<=n-1
//        if(n%i==0){ // i is factor of n
//            flag = true;
//            break;
//        }
//        }if (n==1) {
//            System.out.println("Neither prime nor composite");
//        } else if(flag==false){
//            System.out.println("Prime");
//        } else{
//                System.out.println("Composite no.");
//        }


    }
}
