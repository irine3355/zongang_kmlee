package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule(2024, 3, 20);
        System.out.println(s1); //(s1.toString())-> 문자열로 toString()이 생략 , 객체 주소값
        System.out.println(System.identityHashCode(s1));
        s1.showDate();
    }
}
