package exam03;

public class Ex03 {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(10000000);
        Integer num2 = Integer.valueOf(10000000);
        System.out.println(num1 == num2);
        System.out.println(System.identityHashCode(num1));
        System.out.println(System.identityHashCode(num2));
    }
}
