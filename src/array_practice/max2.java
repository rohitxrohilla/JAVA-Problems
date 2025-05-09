package array_practice;

public class max2 {
    public static void main(String[] args) {

        int[] A = {3, 9, 7, 6, 12, 5, 15};
        int max1,max2;
        max1 = max2 = A[0];

        for (int i = 0; i < A.length; i++) {

            if (A[i] > max1) {
                max1=A[i];
                max2=max1;

            }
            else if(A[i]>max2){
                max2=A[i];
            }
        }
        System.out.println(max2);

    }
}
