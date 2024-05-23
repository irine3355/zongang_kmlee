package exam01_1;
import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
            int[] nums = {22, 11, 10, 2, 6,8, 33};
// 배열 임
            Arrays.stream(nums).filter(x->x%2 ==1).map(x -> x*x).forEach(System.out::println);

//먼저, nums 배열을 스트림으로 변환합니다.
//            그런 다음, 스트림의 각 요소를 필터링하여 홀수만 선택합니다.
//                    선택된 홀수들을 제곱하여 매핑합니다.
//                    각 제곱된 홀수를 출력합니다.
//결과:  121 1089 ( 11과 33의 제곱)
//

            int[] nums2 = Arrays.stream(nums).map(x -> x * x).filter(x -> x%2 == 1).toArray();
            System.out.println(Arrays.toString(nums2));

//먼저, nums 배열을 스트림으로 변환합니다.
//            각 요소를 제곱하여 매핑합니다.
//            매핑된 결과 중에서 홀수만 선택합니다.
//                    선택된 홀수들을 새로운 배열로 변환합니다.
//            이 새로운 배열을 출력합니다.
// 결과:  [121, 1089]
        }
    }



