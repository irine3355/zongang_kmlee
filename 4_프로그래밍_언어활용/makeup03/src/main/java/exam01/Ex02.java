package exam01;

public class Ex02 {
    public static void main(String[] args) {
        Student.id=1000; // 정적인 방법으로 직접 접근 권장(클래스명. 변수명, 클래스변수라고 )

        Student.staticMethod();
    }
}
