package exam03;

import java.text.DecimalFormat;

public class Ex01 {
    public static void main(String[] args) {
        double num1 = 10000000.123;

        DecimalFormat df = new DecimalFormat("0,000.0000");
        String num1Str = df.format(num1);
        System.out.println(num1Str);

        DecimalFormat df2 = new DecimalFormat("#,###.####");
        String num2Str = df2.format(num1);
        System.out.println(num2Str);
    }
}
