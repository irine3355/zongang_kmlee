package exam00;

public class Ex02 {
    // add 메서드 정의
    public static int add(int num1, int num2) {
        return num1 + num2;
    } // add 메서드와 main 메서드가 모두 static으로 선언되어 있습니다. 이는 해당 메서드가 클래스 수준에 속하는 정적 메서드임을 의미합니다.
//num1과 num2가 main 메서드 내에서 지역 변수로 선언되어 있습니다.
    // add 메서드가 정적(static)으로 선언되어 있으므로, 객체 생성 없이도 직접 호출할 수 있습니다.
    public  void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        // add 메서드 호출하여 결과값 저장
        int sum = add(num1, num2);

        // 결과 출력
        System.out.println(sum);
    }
}