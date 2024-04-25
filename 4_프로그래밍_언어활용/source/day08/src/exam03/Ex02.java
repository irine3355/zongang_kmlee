package exam03;

public class Ex02 {
    public static void main(String[] args) {
//        Integer num1 = 10;
//        Integer num2 = 10;

        Integer num1 = Integer.valueOf(10); // Integer 클래스의 정적 팩토리 메서드인 valueOf를 사용하여 정수를 갖는 Integer 객체를 생성합니다.
        Integer num2 = Integer.valueOf(10);
        System.out.printf("num1 주소: %d%n", System.identityHashCode(num1));
        System.out.printf("num2 주소: %d%n", System.identityHashCode(num2));
    }
}