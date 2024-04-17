package exam01;

public class Ex02 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule(2024, 4, 17);
       // s1.showDate();

        Schedule s2 = new Schedule();
       // s2.showDate();
       System.out.println(s1); // showdate 숨기고 펼치고에 따라 주소 값 바뀜 왜?
    }

}
