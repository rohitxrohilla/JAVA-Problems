package array_practice;

public class reverseCopy {
    public static void main(String[] args) {
        int[] A = {8,6,9,10,15}; //L=5
        int[] B = new int[5];

        for(int i=A.length-1;i>=0;i--){
            B[i]=A[A.length-1-i];
        }
        for (int x : B){
            System.out.println(x);
        }
    }
}
