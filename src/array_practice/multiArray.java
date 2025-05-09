package array_practice;

import java.util.Arrays;

public class multiArray {
    public static void main(String[] args) {
//        int[][] A = new int[3][4];
//        int[][] A = {{2,3,4,5},{2,0,9,8},{1,4,2,3}};

//        for (int i=0;i<A.length;i++){
//            for (int j=0;j<A[0].length;j++){
//                System.out.print(A[i][j]);
//            }
//            System.out.println(" ");
//        }

//        for each loop

//        for (int x[]:A){
//            for (int y:x){
//                System.out.println(Arrays.toString(x)); //to avoid hashcodes
//            }
//        }
        int[][] A = new int[3][];
        A[0] = new int[4];
        A[1] = new int[3];
        A[2] = new int[2];

        for (int i=0;i<A.length;i++){
            for (int j=0;j<A[i].length;j++){
                System.out.print(A[i][j]);
            }
            System.out.println(" ");
        }

    }
}
