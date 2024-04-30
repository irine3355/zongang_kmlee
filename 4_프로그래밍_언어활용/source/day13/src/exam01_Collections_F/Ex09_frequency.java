package exam01_Collections_F;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex09_frequency {
    public static void main(String[] args) {
        List<String> chars = Arrays.asList("AA","BB","AA", "CCA", "AA");
        int cnt = Collections.frequency(chars, "AA");
        System.out.println(cnt);
    }
}
