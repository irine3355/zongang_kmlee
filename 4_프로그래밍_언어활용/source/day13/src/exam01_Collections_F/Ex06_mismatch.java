package exam01_Collections_F;

import java.util.Arrays;

public class Ex06_mismatch {
    public static void main(String[] args) {
        String[] fruits1 = {"사과", "오렌지", "망고", "멜론"};
        String[] fruits2 = {"사과", "오렌지", "바나나", "포도"};

        int pos = Arrays.mismatch(fruits1, fruits2);
        System.out.println(pos); // 순번 2에서 첫 미스매치 찾아냄

    }
}
