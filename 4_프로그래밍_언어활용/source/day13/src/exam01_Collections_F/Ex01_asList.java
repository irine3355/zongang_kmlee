package exam01_Collections_F;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01_asList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1", "이름2", "이름3"
        );
       // names.remove(0); 오류 .asList 수정불가, 추가, 삭제도 불가
        System.out.println(names);
        List<String> name2 = new ArrayList<>(names);
        name2.remove(0);
        System.out.println(name2);
    }
    // 변경이 필요한 경우는 list의 구현 클래스의 객체 생성시 생성자 매개변수로 대입

}
