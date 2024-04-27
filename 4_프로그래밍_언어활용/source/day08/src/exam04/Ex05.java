package exam04;

import java.util.Arrays;

public class Ex05 {
    public static void main(String[] args) {
        int[] nums1 = {10, 20, 30, 40};
        int[] nums2 = {10, 30, 20, 40};


        boolean isSame = Arrays.equals(nums1, nums2);
        System.out.println(isSame);// 1 배열 순서도 같아야 함



//        boolean isSame2 = true;
//        for (int i = 0; i < nums1.length; i++) {
//            if (nums1[i] != nums2[i]) {
//                isSame2 = false;
//                break;  // 2
//            }
//        }

//        System.out.println(isSame2);
    }
}
