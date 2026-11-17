package com.geeks.conditionals;
import java.util.Scanner;
/*Q: take positive integer input and tell if it is divisible by 5 oe 3*/
public class nested3AndF5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int i = sc.nextInt();
        if (i % 5 == 0) {
            if (i % 3 == 0) {
                System.out.println("number is divisible by 3 and 5 both");
            } else {
                System.out.println("not divisible by 3 and 5 both");
            }
        } else {
            System.out.println("Not divisible");
        }
    }
}
