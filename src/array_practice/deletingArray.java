package array_practice;

public class deletingArray {
    public static void main(String[] args) {
        int[] A = new int[10];
        A[0]=5;
        A[1]=9;
        A[2]=6;
        A[3]=10;
        A[4]=12;
        A[5]=7;
        A[6]=0;

        int n=6;
        int index=1;

        for(int i=index;i<n-1;i++){
            A[i]=A[i+1];
        }
        for (int x:A){
            System.out.println(x);
        }
    }
}
