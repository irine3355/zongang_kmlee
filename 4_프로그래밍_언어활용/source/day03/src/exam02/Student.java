package exam02;

public class Student {
    public static int id;
    private String name;
    private String subject;

//    public Studnet (int id, String name, String subject){
//        this.id = id;
//        this.name = name;
//        this.subject = subject;
//    }

    public Student() {

    }

    public Student(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public static void staticMethod (){ // 객체와 상관 없이 사용 가능, this 지역변수 없음 객체자원 접근 불가
        System.out.println("정적 메서드!!");
        id =1000;
     //  this.name = "이이름";  객체자원 접근 불가
       // this.instanceMethod();
    }

    public static void instanceMethod (){// this 지역변수 있음
        System.out.println("인스턴스 메서드!!");

        staticMethod ();
        id =1000;
    }

    @Override
    public String toString() {
        return "Studnet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }


}
