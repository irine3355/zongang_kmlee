package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student(); //객체 만듬, 공간 할당 받음 지역변수 스택
        s1.id = 1000; // 힙
        s1.name = "이이름"; // 힙
        s1.subject = "과목1"; // 힙

        System.out.println("s1: "+ System.identityHashCode(s1));

         //새로운 Student 객체를 생성하고 이를 변수 s2에 할당하는 구문
        Student s2 = new Student();
        System.out.println("s2: "+ System.identityHashCode(s2));
       // s1.study();
        Student s3 = s2;
        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s2 == s3 " + (s2 == s3));

        s3.name = "박이름";
        System.out.println(" s3:------- " );
        s3.study();
        s2.study();// s2도 바뀜!
    }
}
