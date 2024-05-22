package exam01_1;

public class Ex04_q4 {
    public static void main(String[] args) {
        int lineCount = 4;
        int spaceCount = lineCount / 2 + 1;
        int starCount = 1;

        for (int i = 0; i < lineCount; i++) { // 0~3 4번 반복
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < starCount; j++) {
                System.out.print('*');
            }
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(' ');
            }
                spaceCount -= 1;
                starCount += 2;
                System.out.println();

            }
        }
    }