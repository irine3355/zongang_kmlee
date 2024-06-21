package exam01;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class Ex01 {

    public static void main(String[] args) throws Exception {


        // JoinService 클래스의 Class 객체를 가져옵니다.
        Class clazz = JoinService.class;
        // JoinService 클래스의 모든 생성자를 가져옵니다.
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            // 각 생성자의 매개변수 갯수를 출력합니다. 특정 생성자의 매개변수 타입들을 반환
            System.out.println("매개변수 갯수 : " + constructor.getParameterTypes().length);

            // 생성자의 매개변수 타입에 맞는 인자 리스트를 준비합니다.
            List<Object> arguments = new ArrayList<>();
            for (Class clz : constructor.getParameterTypes()) {
                if (clz == String.class) { // 매개변수 타입이 String인 경우
                    arguments.add("문자열");
                } else if (clz == int.class) { // 매개변수 타입이 int인 경우
                    arguments.add(100);
                } else if (clz == long.class) { // 매개변수 타입이 long인 경우
                    arguments.add(200L);
                }
            }

            // 준비된 인자 리스트를 사용하여 객체를 인스턴스화 합니다.
            Object obj = arguments.isEmpty()
                    ? constructor.newInstance() // 인자가 없는 생성자
                    : constructor.newInstance(arguments.toArray()); // 인자가 있는 생성자

            // 생성된 객체를 JoinService 타입으로 캐스팅합니다.
            JoinService service = (JoinService) obj;
            // 생성된 객체를 출력합니다.
            System.out.println("service : "+service.toString());
        }


        /*
        Constructor c1 = constructors[0];
        Constructor c2 = constructors[1];
        Constructor c3 = constructors[1];

        JoinService s1 = (JoinService) c1.newInstance();
        JoinService s2 = (JoinService) c2.newInstance("값1", 100);
        JoinService s3 = (JoinService) c3.newInstance(new Object[] {"값2", 200, 300});

        /*
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

         */
    }
}