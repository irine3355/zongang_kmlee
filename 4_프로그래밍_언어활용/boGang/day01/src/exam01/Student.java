package exam01;

public class Student {
    int id; // 인스턴스 필드
    String name;  // 인스턴스 필드
    String subject;  // // 인스턴스 필드 클래스를 정의하

    public Student() { //Student 클래스의 기본 생성자
//객체 생성 이후 수행할 작업에 대한 내용 -
// 주로 멤버 변수의 초기화를 정의
//        id = 1000;
//        name = "김이름";
//        subject = "과목1";

    }

     //  System.out.println("Student: "+ System.identityHashCode(Student)); 안대요??

    void study() {
        System.out.printf("id=%d, name=%s, subject=%s%n", id, name, subject);
    }
}
