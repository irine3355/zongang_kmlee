package exam02_stream;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        /**
         * 문자열 앞 뒤로 별표
         * 대무자 변환
         * 출력
         */

        String[] fruits = {"apple", "orange", "mango", "melon"};
        Arrays.stream(fruits).map(s -> "*" + s + "*")
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
