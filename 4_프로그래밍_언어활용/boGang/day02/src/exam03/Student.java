package exam03;

public class Student {
    int id;
    String name;
    String subject;

 //public Student(){} //기본생성자
    void study(){
        System.out.printf("id=%d, name=%s, subject=%s%n", id, name, subject);
    }

//    public Student(){int _id, }


    public class Ex01{

        public static void main(String[] args) {

             Student s1 = new Student(); // Student()객체 만드는 생성자 메서드
            s1.id = 1000;
            s1.name = "이이름";
            s1.subject = "과목1";
        }
    }
}
