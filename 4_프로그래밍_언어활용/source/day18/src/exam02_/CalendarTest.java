package exam02_;

import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("년 월 입력:");
            String input = sc.nextLine(); // 2024 5

            if (input.equals("exit")) {
                System.out.println("종료 합니다.");
                break;
            }

            try {
                String[] data = input.split("\\s+");
                int year = Integer.parseInt(data[0]);
                int month = Integer.parseInt(data[1]);

                System.out.printf("------%d년 %d월 --------%n", year, month);
                System.out.println("일   월   화   수   목   금    토");
            } catch (Exception e) {

            }
            System.out.println("입력 형식이 잘못되었습니다. 입력 예)2024 5");
            continue;
        }

    }

    public static Object getCalendar(int year, int month) {
        /**
         * 매월 1일이 어떤 요일에 시작하는 지
         * 종료일이 무슨 요일인지
         */

    }

}
