package string_practice;

public class emailques {
    public static void main(String[] args) {

        String str1 = "progammer@gmail.com";
// checking domain = gmail.com
//        if (str1.endsWith("gmail.com")){
//            System.out.println("yes it is gmail");
//        }
//        else
//            System.out.println("not gmail");

//seperating username and domain name
        System.out.println(str1.indexOf("@"));
        int i = str1.indexOf("@");
        String str2 = str1.substring(0,i);
        System.out.println(str2);
        String str3 = str1.substring(i+1,str1.length());
        System.out.println(str3);


    }
}
