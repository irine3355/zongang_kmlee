package exam03;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        Class cls = Ex02.class;//Ex02 클래스의 Class 객체를 생성합니다.

        MyAnno anno = (MyAnno) cls.getAnnotation(MyAnno.class);
//Ex02 클래스에 적용된 MyAnno 어노테이션을 가져오는 역할을 합니다. getAnnotation(MyAnno.class) 메서드를 사용하여 클래스에 적용된 MyAnno 어노테이션을 가져옵니다.
        int min = anno.min(); // 어노테이션에서 설정된 값을 읽어옵니다.
        int max = anno.max(); // 어노테이션에서 설정된 값을 읽어옵니다.


        System.out.printf("min=%d, max=%d%n", min, max);
        String[] names = anno.names();
        System.out.println(Arrays.toString(names));

        String value = anno.value();
        System.out.println(value);
    }
}
