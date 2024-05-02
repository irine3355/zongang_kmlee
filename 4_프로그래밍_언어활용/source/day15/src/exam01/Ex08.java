package exam01;

import java.util.Optional;

public class Ex08 {
    public static void main(String[] args) {
       // String str = "ABC";
        String str = null;
        Optional<String> opt =Optional.of(str);
      //  System.out.println(opt.get());

        String value = opt.orElse("기본값");
        System.out.println(value);
    }
}
