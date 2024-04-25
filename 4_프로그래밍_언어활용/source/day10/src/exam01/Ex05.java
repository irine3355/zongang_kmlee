package exam01;

public class Ex05 {
    public static void main(String[] args) {
        String trans1 = "BUS";

    //    Transpotation BUS = Enum.valueOf(Transpotation.class,trans1);

        Transpotation BUS = Transpotation.valueOf(trans1);//문자열은 값, 값을 상수로 변환함
        System.out.println(BUS.name());// 상수를 문자열로 변환 출력

    }
}
