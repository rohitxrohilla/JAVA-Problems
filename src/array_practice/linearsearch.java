package array_practice;

public class linearsearch {
    public static void main(String[] args) {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int key = 11;
        for(int i=0;i<A.length;i++){
            if(key==A[i]){
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println("not found");
    }
}
