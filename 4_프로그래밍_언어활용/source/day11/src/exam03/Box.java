package exam03;

public class Box <T>{ // 객체만들때

    private T item;
    
    // 지네릭 클래스 T ,  아래T str1, T str2  Box가 객체가 될때 T가 결정
    public  void method1(T str1, T str2){//

    }
    //지네릭 메서드 T- 호출시의 T의 자료형이 결정된다.
    public <T> void method2(T str1, T str2){
        
    }
}

