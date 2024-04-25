package exam02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  System.out.print("숫자를 포함하여 입력:");
        System.out.print("숫자만 입력:");
        String str = sc.nextLine();

        Pattern p1 = Pattern.compile("[\\D]"); // 숫자 아닌 문자
       // Pattern p1 = Pattern.compile("[\\d]"); // 자바에서는 \\두개 써야 함, 첫번째 \는 사라짐
        //  \\D 는 ^\\d 같음 .줄바꿈 문자를 제외한 문자 한개
     //   Pattern p1 = Pattern.compile("[0-9]");
      //  Pattern p1 = Pattern.compile("[^0-9]");// 숫자아닌 문자
        Matcher m1 = p1.matcher(str);
        if(m1.find()) {
            System.out.println("숫자만 입력하세요.");

        }
    }
}
