package  com.geeks;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter radius of circle: ");
        //double radius = sc.nextDouble();
        //double area = Math.PI*radius*radius;
       // System.out.print("Area of circle of radius "+ radius+" is ");
      //  System.out.println(area);
        System.out.print("Enter the value to be squared:");
        int s = sc.nextInt();
        int square = s*s;
        System.out.println("Square of the value you put is " + square);

    }
}