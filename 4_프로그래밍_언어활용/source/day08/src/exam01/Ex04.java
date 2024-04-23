package exam01;

public class Ex04 {
    public static void main(String[] args) {
        String str1 = new String("ABC");
        String str2 = new String("ABC");
        System.out.printf("str1 == str2: %s%n", str1 == str2);
        System.out.printf("b1주소: %d%n",System.identityHashCode(str1) );
        System.out.printf("b1주소: %d%n",System.identityHashCode(str2) );
        System.out.printf("str1.equals(str2): %s%n", str1.equals(str2));
    }
}
