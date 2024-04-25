package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex01 {
    public static void main(String[] args) {
        String str = "I like java and javascript";
        Pattern p1 = Pattern.compile("java");
        Matcher m1= p1.matcher(str);
        System.out.println(m1.find()); //첫번째 단어 찾음 이동하면서
        System.out.println(m1.group()); //해당시점 패턴에 일치하는 문자열

        System.out.println(m1.find()); //두번째 단어 찾음 이동하면서
        System.out.println(m1.group()); //해당시점 패턴에 일치하는 문자열

        System.out.println(m1.find()); //세번째 단어 없으니까 거짓
        System.out.println(m1.group()); //패턴에 일치하는 문자열


    }
}
