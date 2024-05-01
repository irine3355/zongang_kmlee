package exam02_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex05 {
    public static void main(String[] args) {
        int[] nums = { 22, 11,15, 35, 40, 77};
        IntStream stm = Arrays.stream(nums);
        int total = stm.map(x -> x*x).sum();
        System.out.println(total);

        stm = Arrays.stream(nums); // 새로 스트림 만들어야 다시 사용할 수 있음
        int total2 = stm.map(x -> x*x).sum();
        System.out.println(total2);
    }
}
