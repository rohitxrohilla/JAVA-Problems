package com.rohit;

import java.util.Scanner;

public class switchstate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        switch(n){
            case 1 :
                System.out.println("January");
                break;
            case 2 :
                System.out.println("feb");
                break;
            case 12 :
                System.out.println("dec");
                break;

            default:
                System.out.println("not mentioned");
        }
    }
}
