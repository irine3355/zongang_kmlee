package exam01_Generics;

public class Ex01 {
    public static void main(String[] args) {
       // Box<Apple> appleBox = new Box<Apple>();
        Box<Apple> appleBox = new Box<>(); // 이렇게 간단하게 써도 됨
        appleBox.setItem(new Apple());
       // appleBox.setItem(new Grape()); x 타입 안정성 확보

        Apple apple = appleBox.getItem(); // 형변환x
    }
}
