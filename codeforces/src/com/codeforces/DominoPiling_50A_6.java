package com.codeforces;
import java.util.Scanner;

public class DominoPiling_50A_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int dominoes = (m * n) / 2;

        System.out.println(dominoes);
    }
}
