package codingTest;

//배열의 평균값
public class Ex01 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double result = solution(numbers);
        System.out.println("평균: " + result);

    }
        public static double solution ( int[] numbers){
            if (numbers.length == 0) {
                return 0; // 배열이 비어 있다면 0을 반환하여 0으로 나누는 것을 피합니다.
            }
            double sum = 0;
            // 배열 안 모든 숫자들의 합을 계산
            for (int number : numbers) {
                sum += number;
            }

            double average = sum / numbers.length;
            return average;

    }

}
