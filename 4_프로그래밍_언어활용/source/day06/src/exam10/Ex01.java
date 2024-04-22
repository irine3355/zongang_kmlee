package exam10;

public class Ex01 {

int num1 = 10;
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner(); //내부클래스를 객체 생성하려면 외부 클래스의 객체 생성후 내부클의 객체 생성가능
        inner.method();
        System.out.println(Outer.Inner.num3);

    }
}
