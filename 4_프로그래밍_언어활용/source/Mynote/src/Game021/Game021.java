package Game021;

import java.util.Scanner;

public class Game021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 게임 루프
        while (true) {
            // 사용자 입력 받기
            System.out.print("Enter '묵', '찌', or '빠', or '종료' to quit: ");
            String input = scanner.nextLine();

            // 종료 확인
            if (input.equalsIgnoreCase("종료")) {
                System.out.println("게임 종료.");
                break; // 게임 종료
            }

            // 유효성 검사
            if (!(input.equals("묵") || input.equals("찌") || input.equals("빠"))) {
                System.out.println("Error: Invalid input. Please enter '묵', '찌', '빠', or '종료'.");
                continue; // 잘못된 입력이면 다시 반복
            }

            // 시스템 랜덤으로 묵찌빠 설정
            int randomInt = (int) (Math.random() * 3);
            char computerChoice;
            if (randomInt == 0) {
                computerChoice = '묵';
            } else if (randomInt == 1) {
                computerChoice = '찌';
            } else {
                computerChoice = '빠';
            }
            System.out.println("컴퓨터가 선택한 묵찌빠: " + computerChoice);

            // 대결 및 승부 결정
            if (input.equals(String.valueOf(computerChoice))) {
                System.out.println("비겼습니다!");
            } else {
                if ((input.equals("묵") && computerChoice == '찌') ||
                        (input.equals("찌") && computerChoice == '빠') ||
                        (input.equals("빠") && computerChoice == '묵')) {
                    System.out.println("사용자 승!");
                } else {
                    System.out.println("컴퓨터 승!");
                }
            }
        }

        scanner.close(); // 게임 종료 시 스캐너 닫기
    }
}
