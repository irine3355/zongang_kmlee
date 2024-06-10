package exam01;

public class Ex04 {
    public static void main(String[] args) {

        Student s1 = new Student(); // 생성자도 함수 스텍
        System.out.println("s1: "+ System.identityHashCode(s1));

        s1.study();

        s1.name = "dfdf";
        s1.study();
        System.out.println("s1: "+ System.identityHashCode(s1));

        // 네임 값이 변경되었지만 해시코드는 그대로임
    }
}
