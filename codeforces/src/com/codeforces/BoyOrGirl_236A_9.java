package com.codeforces;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class BoyOrGirl_236A_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();

        Set<Character> distinctChars = new HashSet<Character>();
        for (int i = 0; i < username.length(); i++) {
            distinctChars.add(username.charAt(i));
        }

        int count = distinctChars.size();

        if (count % 2 == 1) {
            System.out.println("IGNORE HIM!");
        } else {
            System.out.println("CHAT WITH HER!");
        }
    }
}

