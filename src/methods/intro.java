package methods;

import java.util.Arrays;

public class intro {

//    static int max(int x,int y){
//        if (x>y)
//            return x;
//        else return y;
//    }
//
//    public static void main(String[] args) {
//        int a = 10; int b = 15; int c;
//        c = max(a,b);
//       System.out.println(c);
//    }


//    static void inc(int x){
//        x++;
//        System.out.println(x);
//    }
//
//    public static void main(String[] args) {
//        int a = 10;
//        inc(a);
//        System.out.println(a);
//    }

    static void update(int[] A){
        A[0]=25;

    }

    public static void main(String[] args) {
        int [] A = {2,4,4,5};
        update(A);
        System.out.println(Arrays.toString(A));
    }

 
}
