package exam01;

public class Student {
    int id;
    String name;
    String subject;

//    //생성자
//    public Student() {
//        //객체 생성 이후 실행되는 부분 id name  subject 는 이미 변수 된 상태
//        //멤버 변수의 초기화 작업을 주로 많이 정의
//        id = 1000;
//        name = "이이름";
//        subject = "과목1";
//
//    }


//public Student() {}

//// 생성자 오버로드
//    public Student (int _id, String _name, String _subject){
//        id = _id; //  멤버변수에 지역 변수 대입
//        name = _name;
//        subject = _subject;
//    }

    void study() {
        System.out.printf("id=%d, name=%s, subject=%s%n", id, name, subject);

    }
}
