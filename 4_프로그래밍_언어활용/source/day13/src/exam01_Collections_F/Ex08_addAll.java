package exam01_Collections_F;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex08_addAll {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "이름1", "이름2", "이름3");
        System.out.println(names);
    }
}
