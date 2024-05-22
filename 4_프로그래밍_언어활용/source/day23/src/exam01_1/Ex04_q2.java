package exam01_1;

public class Ex04_q2 {
    public static void main(String[] args) {


        int i;
        int j;

        for (i = 2; i < 10; i++) {
            if (i %2 != 0) continue;
            System.out.println("====" + i + "단 ====");
            for (j = 1; j < 10; j++) {
                System.out.println(i + "X" + j + "=" + i * j);
            }
            System.out.println();
        }
    }
}
