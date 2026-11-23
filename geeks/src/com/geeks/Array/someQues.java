package com.geeks.Array;
import java.util.Scanner;

public class someQues {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//     Q:given an array of marks of students, if the mark of any student
//      is less than 35 print its roll number.(roll no. here refers to the index
//      of the array
//        int[] marks = {100, 93, 32, 80, 31, 9, 87, 35, 34};
//        for (int i = 0; i< marks.length;i++){
//            if (marks[i]<35){
//                IO.print(i+ " ");
//            }
//        }

        //Again
//        int[] marks= {45,34,32,67,76,7,36};
//        for(int i = 0; i<marks.length;i++){
//            if (marks[i]<35){
//                IO.println(i);
//            }
//        }

       //Q:Which element of the array does this expression reference?
        //num[4]
        //A: element of 'num' at the 4th index, which is 5th element from the start

        //Q:Calculate the sum of all the elements in the  given array.
//        int[] x = {21, 23, 35, 64};
//        int sum = 0;
//        for (int i =0; i<x.length;i++){
//            sum += x[i];
//        }
//        IO.println(sum);

        //Again
//        int[] y = {23,34,46,31,75,21};
//        int sum = 0;
//        for(int i = 0; i<y.length;i++){  // here i<=y.length gives index out of bounds exception
//            sum += y[i];
//        }
//        IO.println(sum);


        //Linear Search
        //Q:Find the element 'x' in the array. Take array and x as input
//        IO.print("Enter the size of array: ");
//        int n = sc.nextInt();
//        int[] x = new int[n];
//        IO.print("Enter elements of array: ");
//        for(int i = 0; i<n;i++){
//            x[i] = sc.nextInt();
//        }
//        for (int i=0;i<x.length;i++){
//            IO.print(x[i]+" ");
//        }
//        IO.println();
//        IO.print("Enter the number you want to scan to check if its in the array: ");
//        int y = sc.nextInt();code
//        boolean flag = false; //nahi mila
//        for (int i=0;i<x.length;i++){
//            if (x[i]==y){
//                flag = true; //Mil gaya
//                IO.println("Exists in the array");
//                break;
//            }
//        }
//        if (flag==false){
//            IO.println("Doesn't exist in the array");
//        }



        //Again
        //Taking input of array
        IO.print("Enter size elements: ");
        int n = sc.nextInt();
        int[] size = new int[n];
        IO.println("Okay, remember to only put "+ n + " number of elements! Now...");
        IO.print("Enter elements of array: ");
        for (int i =0; i<n; i++){
            size[i] = sc.nextInt();
        }

        // Writing output now
        IO.print("Array is: ");
        for (int i=0 ; i<size.length;i++){
            IO.print(size[i]+" ");
        }
        IO.println();
        IO.print("Enter the number you wish to scan for in the array: ");
        int u = sc.nextInt();
        boolean flag = false; // Not found
        for (int i = 0; i < size.length;i++){
            if (size[i]==u){
                flag = true; // Found
                IO.println("That Exists");
                break;
            }
        }

        if (flag == false){
            IO.println("Doesn't exist");
        }

        //Q:Find the maximum value out of all the elements in the array
//        int[] x = {21, 23, 35, 64, 992, 6664,13,534,32};
//            int max = -1;
//            for(int i=0;i<x.length;i++){
//                if (x[i]>max){ //agar array mea jo element hai wo max se bada hai
//                    max = x[i]; //toh hum max mea wo value put kardenge
//                }
//            }
//            IO.println(max);


        //For negative numbers:
//        int[] x = {-2,-5,-67,-4};
//        int max = x[0]; //if we initialize max with any element present in the array then, kaam banjayega
//        for(int i=0;i<x.length;i++){
//            if (x[i]>max){
//                max = x[i];
//            }
//        }
//        IO.println(max);


        //Another way
//        int[] arr = {-4,-5,-2,-67,-2,-3};
//        int max = Integer.MIN_VALUE;
//        for(int i=0;i<=arr.length; i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        IO.println(max);

        //Q:Find the second-largest element in the given array

    }
}
