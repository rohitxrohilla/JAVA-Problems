package array_practice;

public class stringSort {
    public static void main(String[] args) {
        String arr[] = {"helo","bye","apple","mango"};
        java.util.Arrays.sort(arr);
        for (String x:arr){
            System.out.println(x);
        }
    }
}
