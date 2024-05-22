package exam04_stream;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        Integer[] nums1={1,2,3,4,5,6,7,8,9,10};

        int result1 = Arrays.stream(nums1).mapToInt(x -> x*x).filter(x ->x%2 ==1).sum();

        System.out.println(result1);
    }
    }
// 터미널 결과:
// 165
