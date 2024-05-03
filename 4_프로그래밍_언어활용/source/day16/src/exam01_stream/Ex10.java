package exam01_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex10 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1","이름1","이름1" );
        List<String> fruits = Arrays.asList("Apple","Orange","Melon" );

        Stream<Stream<String>> stm = Stream.of(names.stream(), fruits.stream());

        // stm.forEach(System.out::println);
//        stm.forEach(st ->{
//            st.forEach(System.out::println);
//        });

       // stm.flatMap(s ->s).forEach(System.out::println);

        String[] strs =stm.flatMap(s ->s).toArray(String[]::new);//평탄화 작업
        System.out.println(Arrays.toString(strs));

    }
}
