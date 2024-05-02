package exam01;

import java.util.Arrays;
import java.util.List;

public class Ex07 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("사과", "배", "오렌지", "망고", "멜론");

        String[] n = fruits.stream()
                .peek(System.out::println)// 확인 용도
                .skip(4) // 처음 몇개 요소 스킵
                .limit(2)
                .toArray(String[]::new);
        System.out.println(Arrays.toString(n));
    }
}
