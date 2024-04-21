package exam03;

public interface Calculator {
   int NUM = 10; //멤버변수 아님, 스태틱, public static final 자동으로 정적상수 추가됨
    public int add(int num1, int num2);
   // public int add();
    // 자동으로 public abstract 추가한것과 같음
}
