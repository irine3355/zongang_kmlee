package exam01_Collections_F;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex10_asList_min_max {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1", "이름2","이름4","이름5","이름3");

        String max = Collections.max(names); //정열후 가장 마직막 요소
        String min = Collections.min(names); //정열후 가장 첫 요소

        System.out.printf("max=%s, min=%s%n", max, min);
    }
}
