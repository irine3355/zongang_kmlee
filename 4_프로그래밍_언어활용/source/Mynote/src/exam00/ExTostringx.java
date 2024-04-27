package exam00;

public class ExTostringx {
    public static void main(String[] args) {
        ExTostring book1 = new ExTostring(200, "개미");

        // 클래스 정보(클래스 이름, 주소 값)
        System.out.println(book1);

        // toString())) 메서드로 인스턴스 정보(클래스 이름, 주소 값)를 보여 줌
        System.out.println(book1.toString());
    }
}
