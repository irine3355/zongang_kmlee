package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(("text1.txt"))){

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
