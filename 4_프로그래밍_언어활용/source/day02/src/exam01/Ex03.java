package exam01;

public class Ex03 {
    public static void main(String[] args) {
       Student s1 = new Student(1000, "이이름", "자바");
       s1.study (); // 함수가 실행되려면 우선 객체가 먼저 생성되어야 한다.
       // System.out.println(System.identityHashCode(s1)); //메서드는 객체의 해시 코드를 반환하는 메서드입니다.
//해시 코드(Hash code)는 객체를 식별하는 데 사용되는 정수 값입니다.
        Student s2 = new Student(1001, "이름", "바");
        s2.study ();
    }
}
