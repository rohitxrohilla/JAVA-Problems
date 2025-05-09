package array_practice;

public class insertingElement {
    public static void main(String[] args) {
        int[] A = new int[10];
        A[0]=5;
        A[1]=9;
        A[2]=6;
        A[3]=10;
        A[4]=12;
        A[5]=7;
        int index = 2; //where to insert
        int n=6; //no of elements

//        for(int i =A.length-4;i>2;i--){ instead of this
        for(int i =n;i>index;i--){
            A[i]=A[i-1];
        }
        A[2]=15;
        for (int x:A){
            System.out.println(x);
        }
    }
}
