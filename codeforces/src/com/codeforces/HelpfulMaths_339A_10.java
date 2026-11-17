package com.codeforces;
import java.util.Scanner;
import java.util.Arrays;

public class HelpfulMaths_339A_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] parts = s.split("\\+");

        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            if (i > 0) System.out.print("+");
            System.out.print(numbers[i]);
        }
        System.out.println();
    }
}
