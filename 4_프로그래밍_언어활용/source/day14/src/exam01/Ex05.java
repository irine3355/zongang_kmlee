package exam01;

import java.util.function.Function;

public class Ex05 {
    public static void main(String[] args) {
        Function<String, Integer> func1 = s -> s.length();
        Function<Integer, Integer> func2 = x -> x * x;
       // Function<String, Integer> func3 = func1.andThen(func2);
        Function<String, Integer> func4 = func2.compose(func1); // func1->func2 순서로 계산하고 결합
        // func1의 글자수 반환, func2는 3*3, func3 두함수를 결합하여 결과를 반환
        int num = func4.apply("가나다");
        System.out.println(num);


//        int len = func1.apply("가나다");
        //    System.out.println(len);
    }
}
