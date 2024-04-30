package exam01_Collections_F;

import java.util.Arrays;
import java.util.Comparator;

public class Ex07_sort {
    public static void main(String[] args) {
       // int[] nums = {22, 10, 5, 1, 99, 50};

      //  Arrays.sort(nums);

        Integer[] nums = {22, 10, 5, 1, 99, 50};
        Arrays.sort(nums, Comparator.reverseOrder());
        System.out.println(Arrays.toString(nums));
    }
}
