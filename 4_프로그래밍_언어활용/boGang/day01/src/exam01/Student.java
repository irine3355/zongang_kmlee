package exam01;

public class Student {
    int id;
    String name;
    String subject;

    public Student() {
//객체 생성 이후 수행할 작업에 대한 내용 -
// 주로 멤버 변수의 초기화를 정의
        id = 1000;
        name = "김이름";
        subject = "과목1";

    }

    void study() {
        System.out.printf("id=%d, name=%s, subject=%s%n", id, name, subject);
    }
}
