package exam01_Collections_F;

import java.util.Arrays;

public class Ex04_deepEquals {
    public static void main(String[] args) {
        int[] nums1 = {10,20,30,40};
        int[] nums2 = {10,20,30,40};

//        boolean isSame = true;
//        for (int i =0; i< nums1.length; i++){
//            isSame= false;
//            break;
//        }

        boolean isSame = Arrays.equals(nums1, nums2);
        System.out.println(isSame);

        int[][] nums3 = {{10,20,30}, {40,50,60}};
        int[][] nums4 = {{10,20,30}, {40,50,60}};

        boolean isSame2 = Arrays.deepEquals(nums3, nums4);
        System.out.println(isSame2);


    }
}


