package exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

// java.io.IOE exception 컴파일러가 체크 오류시 클래스파일 안 생김
public class Ex02 {
    public static void main(String[] args) {
        // Throw new FileNotFoundException(...)
        try {
            FileInputStream fis = new FileInputStream("b.text");
            System.out.println("파일처리...");

        } catch (FileNotFoundException e) { // 예외 e 객체
            System.out.println("예외 발생!");
          //  String message = e.getMessage();
         //   System.out.println(message);
            e.printStackTrace();
        }



        System.out.println("매우 중요한 실행 코드...");
    }
}
