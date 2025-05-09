package com.rohit;

public class casting_promotion {
    public static void main(String[] args) {


//        typecasting - narrowing conversion / explicit conversion

        float a = 34.23f;
        int b = (int) a;
        System.out.println(b);

        char ch = 'a';
        int c = ch;
        System.out.println(c);

//        type promotion
//  java automatically converts bytes short and char to int when evaluating expression
        char z = 'r';
        char q = 's';
        System.out.println(z);
        System.out.println(q-z); //promotion occurs in expression only


//  converts long float double to long float double resp. (which is larger).
        int x = 20;
        float y = 23.5f;
        long e = 345;
        double t = 33;
        double ans = x+y+e+t;
        System.out.println(ans);



        
    }
}
