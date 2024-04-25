package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 정규식으로 웹 검색
public class Ex01 {
    public static void main(String[] args) {
        String url = "https://www.naver.com";
        Pattern pattern = Pattern.compile("https?://([^/]+)");//
        Matcher matcher = pattern.matcher(url);
        if (matcher.find()) {
            String domain = matcher.group(0);
            String domain2 = matcher.group(1);


            System.out.println("Domain: " + domain);
            System.out.println("Domain: " + domain2);

        }
    }
}
