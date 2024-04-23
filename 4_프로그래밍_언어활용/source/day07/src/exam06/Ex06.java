package exam06;

public class Ex06 extends java.lang.Object {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "ABC";
        String str3 = new String("ABC");
        System.out.println("str1 : " + System.identityHashCode(str1));
        System.out.println("str2 : " + System.identityHashCode(str2));
        System.out.println("str3 : " + System.identityHashCode(str3));
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str2));

        int num1 = 10;
        int num2 = 10;

        System.out.println(num1 == num2);
    }
}
