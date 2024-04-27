package exam00;

public class Singletontest {

    public static void main(String[] args) {
        // 클래스 이름으로 getInstance() 호출하여 참조 변수에 대입
        Singleton myCompany1 = Singleton.getInstance();
        Singleton myCompany2 = Singleton.getInstance();

        System.out.println(myCompany1 == myCompany2); // 두 변수가 같은 주소인지 확인
    }
}


