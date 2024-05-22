package exam01_1;
//    여기 예제가 있습니다. 이 예제는 문자열 배열을 가지고 각 문자열의 길이를 int로 매핑하여 출력합니다.
//
//            java
//    코드 복사
import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex02 {


        public static void main(String[] args) {
            String[] strings = {"apple", "banana", "orange"};

            // 문자열 배열을 가지고 IntStream을 생성하고 각 문자열의 길이를 int로 매핑합니다.
            IntStream lengthsStream = Arrays.stream(strings).mapToInt(String::length);

            // 각 문자열의 길이를 출력합니다.
            lengthsStream.forEach(System.out::println);
        }
    }
