package exam02_stream;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        int[] nums = {22, 11, 10, 2, 6,8, 33};

        Arrays.stream(nums).filter(x->x%2 ==1).map(x -> x*x).forEach(System.out::println);



        int[] nums2 = Arrays.stream(nums).map(x -> x * x).filter(x -> x%2 == 1).toArray();
        System.out.println(Arrays.toString(nums2));

    }
}
