package exam01;

import java.util.function.IntPredicate;

public class Ex06 {
    public static void main(String[] args) {
        IntPredicate cond1 = x -> x >= 10;
        IntPredicate cond2 = x -> x <= 100;
        IntPredicate cond3 = cond1.and(cond2);
        IntPredicate cond4 = cond2.negate();
        System.out.println(cond3.test(20));
        System.out.println(cond3.test(150));
        System.out.println(cond4.test(150));

    }
}

