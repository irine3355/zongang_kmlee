package exam01;
//변수 두 개를 선언해서 20과 3.0을 대입하고 두 변수의 사칙연산 결과를 정수로 출력해 보시오
public class Ex07_1 {
    public static void main(String[] args) {
       int num1 = 20;
       double num2 = 3.0;

     int sum1 = (int) (num1 + num2);
        int sum2 = (int) (num1 - num2);
        int sum3 = (int) (num1 * num2);
        int sum4 = (int) (num1 / num2);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
    }
}
