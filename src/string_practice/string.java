package string_practice;

public class string {
    public static void main(String[] args) {

//        methods to create a string

        String str1 = "Java Program";
        System.out.println(str1);

//        using constructors

        String str = new String("hello");
        System.out.println(str);

        char ch[] = {'a','b','c','d'};
        String str2 = new String(ch);
        System.out.println(str2);

        byte b[] = {65,66,67,68};
        String str3 = new String(b);
        System.out.println(str3);



        

    }
}
