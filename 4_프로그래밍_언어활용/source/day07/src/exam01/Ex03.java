package exam01;

public class Ex03 {
    public static void main(String[] args) {
        int num3 =30;//지역변수 상수화


        Calculator cal = new Calculator() {

            @Override
            public int add(int num1, int num2) {
               // num3 =50;//지역변수 상수화 ?  int num3 =50; 이면 지역변수가 되어 출동안됨
                return num1+num2;
            }
        };
        Calculator cal2 = (x, y) -> x + y;
    }
}
