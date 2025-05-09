package array_practice;

public class array_intro {
    public static void main(String[] args) {
//        int[] A = new int[5]; //sq bracket can be used after A or before
        int[] A = {1,2,3,4,55}; //int A[] = {1,2,3}

//        traversing array

        for(int i=0;i<A.length;i++){
            System.out.println(A[i]++);
        }
//        for (int i=A.length-1;i>=0;i--){ //reverse
//            System.out.println(A[i]);
//        }

        for(int x:A){  //for each
            System.out.println(x);
        }

    }
}

