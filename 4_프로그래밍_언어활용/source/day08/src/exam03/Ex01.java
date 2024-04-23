package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(10); //오토박싱 참조 자료형 integer 객체 inValue 오토언박싱
        double num2 = num1.doubleValue();

        String str = "1000";
        int num3 = Integer.parseInt(str);

    }
}