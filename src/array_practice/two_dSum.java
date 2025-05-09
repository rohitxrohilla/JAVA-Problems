package array_practice;

import java.util.Scanner;

public class two_dSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A=new int[3][3];
        int[][] B=new int[3][3];
        int[][] C=new int[3][3];
        System.out.println("enter elements of the array A");

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                A[i][j]=input.nextInt();
            }
        }
        for (int i=0;i<A.length;i++){
            for (int j=0;j<A.length;j++){
                System.out.print(A[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("enter elements of B");

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                B[i][j]=input.nextInt();
            }
        }
        for (int i=0;i<B.length;i++){
            for (int j=0;j<B.length;j++){
                System.out.print(B[i][j]);
            }
            System.out.println(" ");
        }

//        for sum

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        System.out.println("sum is");

        for (int i=0;i<C.length;i++){
            for (int j=0;j<C.length;j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println(" ");
        }


    }
}
