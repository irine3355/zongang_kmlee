package exam01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) throws {
        int[] scores = {90, 88, 65, 100, 78, 98};

        try(FileOutputStream fos = new FileOutputStream("score.txt");
            DataOutputStream dos = new DataOutputStream(fos)){
            for(int score:scores){
                dos.writeInt(score);
            }
            Arrays.stream(scores).forEach(dos::writeInt);

        }
    }
}
