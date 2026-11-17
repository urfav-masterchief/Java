package com.geeks;

public class typecasting_3 {
    public static void main(String[] args){
        //typecasting: ek datatype se doosre data type ka conversion
        char ab = 'A';
        int x= ab; //implicit typecasting
        System.out.println(x); // will print the ascii value of the character in ab variable

        char ch = 'a';
        int y = (int)ch; //Explicit typecasting, yani hum dikhake kuch kar rahe hain
        System.out.println(y);

        char cb = 'A', cr = 'a';
        int j = (int)cb+cr;
        System.out.println(j);

        char lala = '3';
        int o = (int)lala;
        System.out.println(o);
        /* so what happens is the ASCII VALUE of the character we put is stored in the char datatype
        so when we convert it to int that value is then showed to us, otherwise;
        the character itself is printed inside the ' '
         */

        //ANOTHER WAY TO PRINT ASCII VALUE OF SMTH
        char hi = 'b';
        System.out.println(hi+0); // JUST ADD 0 NEXT TO THE VARIABLE NAME, thats to print just its value or;
        System.out.println(hi*1);
        System.out.println(hi+hi);
        System.out.println();

        //Integer to character
        int jj = 65;
        char ci = (char)jj; // For integer to char only EXPLICIT typecasting will work, not implicit
        System.out.println(ci);

        int ji = 32; // ASCII value of space is 32
        char cj = (char)ji;
        System.out.println(cj); // Space will be printed
        //check
        char lol = ' ';
        int ui = (int)lol;
        System.out.println(ui); //checked

    }
}
