package exam02;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
//        Calculator cal = new Calculator() {
//            @Override
//            public int add(int num1, int num2) {
//                return  num1+  num2;
//            }
//        };

        int c = 10;
        Calculator cal = (a, b) -> {
            return a + b + c;
        };

        // 람다식

        int result = cal.add(10, 20);
        System.out.println(result);
    }
}
