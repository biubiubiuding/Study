package chd.study.base;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1 == str2);
        String str3 = new String("hello");
        String str4 = new String("hello");
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
    }
}
