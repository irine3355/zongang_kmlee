package exam01;

public class Student {
    int id; // 아직 변수 아님
    String name; //아직 변수 아님
    String subject; //아직 변수 아님

    public Student(int _id, String _name, String _subject) {// _id,_name  _subject 스택영역 기본생성자
        id = _id;
        name = _name;
        subject = _subject;
        // id name subject 힙영역의 변수

        //객체가 생성된 이후 실행 코드
        // 실행 시점? id name subject에 공간을 할당 받은 상태
        // 인스턴스 변수의 초기화 작업을 주로 수행
        // id = 1000; // 대입된다는 건 공간이 있다는 것.
        // name ="이이름";
        // subject ="자바";
        //  System.out.println("객체 생성 이후 실행");;
    }

    public Student() {

    }

    void study() {
        System.out.printf("학번%d, %s가 %s를 공부한다. %n", id, name, subject);
    }
}
