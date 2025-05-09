package array_practice;

public class copyingArray {
    public static void main(String[] args) {
        int[] A = {8,6,9,10,15};
        int[] B = new int[5];

        for (int i=0;i<A.length;i++){
            int temp = A[i];
            B[i] = temp;
        }
        for (int x : A){
            System.out.println(x);
        }
        for (int y : B){
            System.out.println(y);
        }
    }
}
