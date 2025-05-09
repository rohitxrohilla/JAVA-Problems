package array_practice;

import java.util.Scanner;

public class two_dMul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] A = new int[3][3];
        int[][] B = new int[3][3];;
        int[][] C = new int[3][3];;

        System.out.println("enter elements of the array A");

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                A[i][j]=input.nextInt();
            }
        }
        System.out.println("enter elements of B");

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                B[i][j]=input.nextInt();
            }
        }
//        multiply

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                for (int k=0;k<3;k++){
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
    }
}
