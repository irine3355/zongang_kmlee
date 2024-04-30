package exam01_Collections_F;

import java.util.Arrays;

public class Ex03_deepToString {
    public static void main(String[] args) {
        int[][] nums1 = {{10,20,30}, {40,50,60}};
       // System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.deepToString(nums1));
    }

}
