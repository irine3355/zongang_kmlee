package exam01;

public class EX04 {
    public static void main(String[] args) {
        Transpotation trans = Transpotation.TAXI;
        String str = trans.name(); //문자열로 변환 trans.toString() 같음
        System.out.println(str);

        int ordinal = trans.ordinal();
        System.out.println(ordinal); //상수의 위치번호


    }
}
