package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex08 {
    public static void main(String[] args) {
        String str ="AAA\n1234\nB/BB\n45666";
       // Pattern p1 = Pattern.compile("\\b.{4,}\\b");
      //  Pattern p1 = Pattern.compile("\\b.{0,4}\\b");
        Pattern p1 = Pattern.compile("\\b.*\\b");
        Matcher m1 = p1.matcher(str);

        while (m1.find()){
            System.out.println(m1.group());
        }

//        if(m1.find()){
//            System.out.println(m1.group());
//        }
//        if(m1.find()){
//            System.out.println(m1.group());
//        }
//        if(m1.find()){
//            System.out.println(m1.group());
//        }

    }


}
