package exam02;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.text");
            System.out.println("파일 작업..");

            System.out.println("자원해제 완료!");
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            System.out.println("매우 중요한 코드");
            if (fis != null) {
                try {
                    fis.close();// ioe
                } catch (IOException e2) {

                }

            }
        }
    }
}
