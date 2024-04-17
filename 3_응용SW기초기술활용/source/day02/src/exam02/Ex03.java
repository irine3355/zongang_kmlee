package exam02;

public class Ex03 {
    public static void main(String[] args) {
        // int[] nums = {10, 20, 30, 40};// 선언 및 값 초기화
        int[] nums;
        nums = new int[]{10, 20, 30, 40, 50, 60, 70};
        System.out.println("공간의 갯수:" + nums.length);// new int [] 생략 불가
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}