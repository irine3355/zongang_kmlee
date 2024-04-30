package exam02;

import java.util.Arrays;
import java.util.List;

public class Ex01_lamda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1", "이름2","이름4","이름5","이름3");

//        names.forEach(new Consumer<String>() { // 인터페이스가 객체 되는 조건,,, 객체가 되면 매개변수
//            @Override
//            public void accept(String s) { // forEach
//                System.out.println(s);
//            }
//        });

        names.forEach(s -> System.out.println(s)); // 람다식으로 간략히

    }
}
