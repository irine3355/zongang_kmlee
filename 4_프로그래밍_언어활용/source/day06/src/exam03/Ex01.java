package exam03;

public class Ex01 {
    public static void main(String[] args) {
        SimpleCalculator cal = new SimpleCalculator();
        int result = cal.add(10,20);
        System.out.println(result);
        System.out.println(Calculator.NUM ); // 정적상수
    }
}
