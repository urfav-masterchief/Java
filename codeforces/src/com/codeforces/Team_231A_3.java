package com.codeforces;
import java.util.Scanner;

public class Team_231A_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;

        for(int i=0; i<n; i++){
            int p = sc.nextInt();
            int v = sc.nextInt();
            int t = sc.nextInt();

            int sure = p + v + t;

            if(sure >= 2){
                count++;
            }
        }
        System.out.println(count);
    }
}
