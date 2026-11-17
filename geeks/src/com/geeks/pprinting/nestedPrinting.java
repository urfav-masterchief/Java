package com.geeks.pprinting;
import java.util.Scanner;

public class nestedPrinting {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        //Print the given pattern
        //        *****               //No. of lines = 3 (m)
        //        *****               //No. of stars per line = 5
        //        *****

//        System.out.print("Enter the  no. of rows you want to print(m): ");
//        int m = sc.nextInt();
//        System.out.print("Enter the no. of columns to be printed as *- n: ");
//        int n = sc.nextInt();
//        for(int i=1; i<=m;i++){ // First loop is for Rows
//            for(int j = 1; j<=n; j++){  // Second loop is for Columns
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Print a pattern where no. of rows and columns are equal
//        System.out.println("Enter no: ");
//        int n = sc.nextInt();
//        for(int i = 1; i<=n;i++){ // First loop is for Rows
//            for(int j = 1; j<=n;j++){ // Second loop is for Columns
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        /*Q:Print pattern: (Number square)
        * 1234
        * 1234
        * 1234
        * 1234*/

//        System.out.print("Enter no. : ");
//        int n = sc.nextInt();
//        for (int i = 1; i<=n;i++){ //Rows
//            for (int j = 1; j<=n;j++){ //Columns
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        /*Q:Print the given pattern: Alphabet square
        ABCD
        ABCD
        ABCD
        ABCD */

//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        for(int i=1; i<=n;i++){
//            for (int j = 1; j<=n; j++){
//                System.out.print((char)(j+64)+" "); //or i
//            }
//            System.out.println();
//        }

        //Print pattern

//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        for (int i  = 1; i<=n; i++){
//            for (int j = 1; j<=n; j++){
//                System.out.print(i+ " ");
//            }
//            System.out.println();
//        }

        //Q:Print: (star triangle)
        /*
        *
        **
        ***
        ****
         */

//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        for(int i = 1; i<=n; i++){
//            for(int j = 1; j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        /*
        *1
        * 12
        * 123
        * 1234 */

//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        for(int i = 1; i<=n; i++){
//            for(int j = 1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //Q:To print the abput in ABC pattern
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        for(int i = 1; i<=n;i++){
//            for(int j = 1; j<=i;j++){
//                System.out.print((char)(j+64)+ " ");
//            }
//            System.out.println();
//        }

        //Q:To print  A BB CCC DDDD...
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        for(int i = 1; i<=n;i++){
//            for(int j = 1; j<=i;j++){
//                System.out.print((char)(i+64)+ " ");
//            }
//            System.out.println();
//        }

        /*Print: Alphanumeric pattern
        1
        AB
        123
        ABCD
        12345
         */
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        for(int i = 1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                if(i%2!=0){
//                    System.out.print(j+ " ");
//                }else{
//                    System.out.print((char)(j+64)+" ");
//                }
//            }
//            System.out.println();
//        }

        //Q:Print the given pattern: Star triangle flipped
        /*
        ****
        ***
        **
        *
          */
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        for(int i = 1;i<=n;i++){
//            for(int j= 1; j<=n+1-i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Q:Print Digits triangle flipped
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        for(int i = 1; i<=n;i++){
//            for(int j=1;j<=n+1-i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //Q:Print alphabetical triangle flipped
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        for(int i = 1; i<=n;i++){
//            for (int j=1;j<=n+1-i;j++){
//                System.out.print((char)(j+64)+" ");
//            }
//            System.out.println();
//        }

        //Q:Print repeated digits triangle flipped
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        for(int i =1; i<=n;i++){
//            for (int j=1;j<=n+1-i;j++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }

        //Q:Print:
        /*
        *AAAAA
        *2222
        *CCC
        *44
        *E */

//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        for(int i = 1;i<=n;i++){
//            for(int j=1;j<=n+1-i;j++){
//                if(i%2!=0){
//                    System.out.print((char)(i+64)+" ");
//                }
//                else {
//                    System.out.print(i+ " ");
//                }
//            }
//            System.out.println();
//        }

   //Q:Print the given pattern
   /*
   * 1
   * 13
   * 135
   * 1357*/

//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        for(int i = 1; i<=n;i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(2*j-1+" ");
//            }
//            System.out.println();
//        }

        //Q:Print: Floyd's Triangle:
        /*1
        * 23
        * 456
        * 78910*/
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        int a = 1;
//        for(int i = 1 ; i<=n;i++){
//            for (int j = 1; j<=i;j++){
//                System.out.println(a++ +" ");
//                if(a<10) System.out.println(" ");
//            }
//            System.out.println();
//        }

        //Q:Print: 0and 1 triangle
    }
}
