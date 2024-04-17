package exam01;
//논리연산자
public class Ex02 {
    public static void main(String[] args) {
        int num = 10;
        boolean result = num++ > 10 && (num = num + 10) > 15;

        System.out.println(num);
        System.out.println(result);

        boolean result2 = !result;

        System.out.println(result2);
        System.out.println(num);
    }
}
