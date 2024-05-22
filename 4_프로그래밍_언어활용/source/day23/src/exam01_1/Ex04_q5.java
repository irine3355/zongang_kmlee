package exam01_1;

public class Ex04_q5 {
    public static void main(String[] args) {
        int lineCount = 15; ///다른 홀수 값을 넣어보세요
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

if(i<lineCount/2){
    spaceCount -= 1;
    starCount += 2;
}
else {
    spaceCount += 1;
    starCount -= 2;
}


            System.out.println();




        }
    }
}