package exam00;
//Ex01과 Ex02 차이?
public class Ex01 {
    public int add(int num1, int num2) {
      //  int result;
        int  result = num1 + num2;
        return result;
    } // add 메서드와 인스턴스 변수를 가지고 있습니다. 이들은 main 메서드 내에서 해당 클래스의 객체를 생성하여 호출됩니다.
// num1과 num2가 인스턴스 변수로 선언되어 있으므로, 해당 클래스의 객체를 생성한 후에야 접근할 수 있습니다.
    int num1 = 10; // 인스턴스 변수로 선언
    int num2 = 20; // 인스턴스 변수로 선언

    // 생성자를 통해 인스턴스 변수 초기화 생략가능?
//    public Ex01(int num1, int num2) {
//        this.num1 = num1;
//        this.num2 = num2;
//    }


    public static void main(String[] args) {
        Ex01 ex = new Ex01(); // Ex01 클래스의 객체 생성
        int sum = ex.add(ex.num1, ex.num2); // add 메서드 호출하여 결과값 저장
        System.out.println("합계: " + sum); // 결과값 출력
    }
// add 메서드를 호출할 때 해당 클래스의 객체를 생성한 후에 호출합니다.

}



