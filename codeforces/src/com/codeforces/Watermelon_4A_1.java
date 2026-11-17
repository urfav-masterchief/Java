package com.codeforces;
import java.util.Scanner;

public class Watermelon_4A_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0 && n > 2) {
            /* This is the logic check. Let me break it down:

n % 2 == 0 — What does % mean?

The % operator is modulo (remainder). It gives you the remainder after division.

4 % 2 = 0 (4 divided by 2 is 2 with remainder 0)
5 % 2 = 1 (5 divided by 2 is 2 with remainder 1)
10 % 2 = 0 (10 divided by 2 is 5 with remainder 0)
7 % 2 = 1 (7 divided by 2 is 3 with remainder 1)

Pattern: If a number is even, n % 2 = 0. If it's odd, n % 2 = 1.

So n % 2 == 0 means "Is n even?" (Does n divided by 2 have remainder 0?)

&& means AND. Both conditions must be true.

n > 2 means "Is n greater than 2?"

So the full line asks: "Is n even AND is n greater than 2?"*/
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}