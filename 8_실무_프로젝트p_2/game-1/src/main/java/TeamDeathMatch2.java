//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.util.*;
//
//public class TeamDeathMatch2 {
//
//    private static final Scanner scanner = new Scanner(System.in);
//    private static final List<String> rpsMoves = Arrays.asList("가위", "바위", "보");
//    private static final List<String> mukjippaMoves = Arrays.asList("묵", "찌", "빠");
//
//    static class Player {
//        String name;
//        int wins = 0;
//        int losses = 0;
//
//        Player(String name) {
//            this.name = name;
//        }
//    }
//
//    public static void main(String[] args) {
//        // 데이터베이스 연결 설정
//        private String url = "jdbc:oracle:thin:@localhost:1521:XE";
//        private String user = "STUDY"; // SCOTT
//        private String password = "oracle"; // tiger
//
//        // 게임 모드 선택 (PvP 또는 PvC)
//        System.out.println("PvP/PvC 선택: ");
//        String mode = scanner.nextLine();
//
//        // 팀 인원 수 입력 (최대 4명)
//        System.out.println("n:n 데스 매치 (팀 인원을 정해주세요 : (최대 4명)): ");
//        int teamSize = Integer.parseInt(scanner.nextLine());
//
//        // 모든 플레이어 생성
//        List<Player> allPlayers = new ArrayList<>();
//        for (int i = 1; i <= teamSize * 2; i++) {
//            System.out.println("플레이어" + i + "의 이름을 입력하세요: ");
//            String playerName = scanner.nextLine();
//            allPlayers.add(new Player(playerName));
//        }
//
//        try (Connection connection = DriverManager.getConnection(url, user, password)) {
//            // 모든 플레이어 간의 대결 진행
//            for (int i = 0; i < allPlayers.size(); i++) {
//                Player player1 = allPlayers.get(i);
//                for (int j = i + 1; j < allPlayers.size(); j++) {
//                    Player player2 = allPlayers.get(j);
//
//                    System.out.println(player1.name + " vs " + player2.name + " 대결 시작");
//
//                    // 가위바위보 승자를 결정하여 공격권 부여
//                    String attacker = rpsBattle(player1, player2);
//                    if (attacker == null) continue;
//
//                    // 묵찌빠 배틀 진행
//                    Player winner = mukjippaBattle(player1, player2, attacker.equals(player1.name));
//                    if (winner == null) continue;
//
//                    // 결과를 데이터베이스에 저장
//                    saveMatchResult(connection, player1.name, player2.name, winner.name);
//                }
//            }
//
//            // 최종 승리 팀 결정
//            Player finalWinner = determineFinalWinner(allPlayers);
//            if (finalWinner != null) {
//                System.out.println("최종 승자: " + finalWinner.name);
//            } else {
//                System.out.println("결과가 없습니다.");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // 가위바위보 배틀 메서드
//    private static String rpsBattle(Player player1, Player player2) {
//        while (true) {
//            System.out.println("가위바위보 고르기 ({가위,바위,보}): ");
//            String move1 = scanner.nextLine();
//            String move2 = rpsMoves.get(new Random().nextInt(3));
//
//            if (!rpsMoves.contains(move1)) {
//                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
//                continue;
//            }
//
//            System.out.println(player1.name + "의 선택: " + move1);
//            System.out.println(player2.name + "의 선택: " + move2);
//
//            if (move1.equals(move2)) {
//                System.out.println("무승부! 다시 선택하세요.");
//            } else if ((move1.equals("가위") && move2.equals("보")) ||
//                    (move1.equals("바위") && move2.equals("가위")) ||
//                    (move1.equals("보") && move2.equals("바위"))) {
//                System.out.println(player1.name + " 공격권 획득!");
//                return player1.name;
//            } else {
//                System.out.println(player2.name + " 공격권 획득!");
//                return player2.name;
//            }
//        }
//    }
//
//    // 묵찌빠 배틀 메서드
//    private static Player mukjippaBattle(Player player1, Player player2, boolean isPlayer1Attacker) {
//        while (true) {
//            String attackerMove = getMove(isPlayer1Attacker ? player1 : player2, "공격");
//            String defenderMove = getMove(!isPlayer1Attacker ? player1 : player2, "수비");
//
//            System.out.println("공격자: " + attackerMove + ", 수비자: " + defenderMove);
//
//            if (attackerMove.equals(defenderMove)) {
//                System.out.println("무승부! 다시 선택하세요.");
//            } else {
//                return attackerMove.equals("묵") && defenderMove.equals("찌") ||
//                        attackerMove.equals("찌") && defenderMove.equals("빠") ||
//                        attackerMove.equals("빠") && defenderMove.equals("묵")) ?
//                (isPlayer1Attacker ? player1 : player2) :(isPlayer1Attacker ? player2 : player1);
//            }
//        }
//    }
//
//    // 플레이어의 묵찌빠 선택을 처리하는 메서드
//    private static String getMove(Player player, String role) {
//        System.out.println(player.name + "의 " + role + " 선택 ({묵,찌,빠}): ");
//        String move = scanner.nextLine();
//        while (!mukjippaMoves.contains(move)) {
//            System.out.println("잘못된 입력입니다. 다시 시도하세요.");
//            move = scanner.nextLine();
//        }
//        return move;
//    }
//
//    // 매치 결과를 데이터베이스에 저장하는 메서드
//    private static void saveMatchResult(Connection connection, String player1, String player2, String winner) throws SQLException {
//        String sql = "INSERT INTO MatchResults (player1, player2, winner) VALUES (?, ?, ?)";
//        try (PreparedStatement pstmt = connection.prepareStatement(sql);
//
//
//}
//}
