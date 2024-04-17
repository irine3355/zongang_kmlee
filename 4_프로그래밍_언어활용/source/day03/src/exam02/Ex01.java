package exam02;

public class Ex01 {
    public static void main(String[] args) {

        Student s2 = new Student(1001, "김이름", "리액트");
        Student s1 = new Student(1000, "이이름", "자바");
//마지막 끝나는 객체의 스태틱 값이 최종값

        System.out.println("s1:" + s1);
        System.out.println("s2:" + s2);

        System.out.println(Student.id); // 혼동방지 위하여 Student.id로
        System.out.println(Student.id);

        s1.instanceMethod();
    }


}


