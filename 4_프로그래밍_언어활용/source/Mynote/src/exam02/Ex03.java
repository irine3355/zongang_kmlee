package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex03 {
    public static void main(String[] args) {
        String text = "0helloworld";

     //    \bhello\b: 단어 경계를 기준으로 "hello" 단어와 일치
//        Pattern pattern1 = Pattern.compile("\\bhello\\b");
//        Matcher matcher1 = pattern1.matcher(text);
//        while (matcher1.find()) {
//            System.out.println("Found: [" + matcher1.group() + "]");
//        }

        // \Bhello\B: 단어 경계가 아닌 위치에서 "hello"와 일치
        Pattern pattern2 = Pattern.compile("\\Bhello\\B");
        Matcher matcher2 = pattern2.matcher(text);
        while (matcher2.find()) {
            System.out.println("Found: [" + matcher2.group() + "]");
        }
    }
}