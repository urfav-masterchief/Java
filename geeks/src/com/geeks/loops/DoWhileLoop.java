package com.geeks.loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        // int i = 1;
        // do{
        //     this
        //     } while(this is true)

//    int i = 1;
//    do{
//        System.out.println(i);
//        i++;
//    }while(i<=10);
//    }

//        //DIFF BETWEEN ALL LOOPS- DOWHILE runs atleast once
//        for (int i = 11; i <= 10; i++) {
//            System.out.println(i);
//        }
//
//        int j = 11;
//        while (j <= 10) {
//            System.out.println(j);
//            j++;
//        }
//
//        int k = 12;
//        do {
//            System.out.println(k);
//            k++;
//        } while (k <= 10);


        int x = 4, y=0;
        while(x>=0){
            x--;
            y++;
            if (x==y)
                continue;
            else
                System.out.println(x+" "+y);
        }

    }
}
