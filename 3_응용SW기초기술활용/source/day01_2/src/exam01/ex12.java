package exam01;

public class ex12 {
    public static void main(String[] args) {
        int num1 = 13;
        double num2 = 3.6;
       //int num3 = (int) (num1 * num2);//곱셈 결과를 정수로 표현 같은 정수 같은 실수끼리 계산가능
       int num3 = (int) ((double )num1 * num2); // 
        //int num3 =  num1 * (int) num2; //
        System.out.println(num3);
    }
}
