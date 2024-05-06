package exam01;

import java.util.function.BiFunction;

public class Ex02 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> calc = (a, b) -> a + b;
        int result = calc.apply(10, 20);
        System.out.println(result);
    }

    /** 연산을 위해서 Integer-> Int 언박싱 를 언박싱, 박싱 Int->Integer 박싱
     * 반복 자원낭비
     * */


}
