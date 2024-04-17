package exam01;
//구구단을 단보다 곱하는 수가 크거나 같은 경우만 출력하는 프로그램을 만들어 보세요.구현 소스
public class Ex07_5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + "단=====");
            for (int j = 1; j <= 9; j++) {
                //  i =1 ||
                if (i >j) {
                     continue;
                    //break;
                }

                System.out.printf("%d X %d = %d\n", i, j, i * j);
            }
        }
    }

}
