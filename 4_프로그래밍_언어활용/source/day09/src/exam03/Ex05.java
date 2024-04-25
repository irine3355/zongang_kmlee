package exam03;

public class Ex05 {
    public static void main(String[] args) {
        String str = " I like java and javascript";
        boolean matched = str.matches(".*java.*");//.* 뭔가 0개이상 있을수도 없을수도 있다
        System.out.println(matched);

        String str2 = "  ABC    ";

        String str3 = str2.stripLeading(); //왼쪽 여백제거
        String str4 = str2.stripTrailing();
        System.out.println(str3);
        System.out.println(str4);
    }
}
