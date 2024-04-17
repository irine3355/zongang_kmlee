package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();  // 클래스는 객체를 만들면 있을 구성 요소를 정의 -> 실제로 존재 X, 코드 그 상태

        s1.id = 1000;
        s1.id = 2000;

        Student s2 = new Student();

        s2 = new Student();


        // new Student() -> 힙 메모리에 객체가 생성(변수 공간을 할당) -> 실제로 변수가 되었다(실제 존재)
        // 인스턴스(실체) - 생성된 객체, 인스턴스 == 객체
    }
}
