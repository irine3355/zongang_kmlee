package exam01;

public class Ex03 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int r = add(num1, num2);
        // System.out.println(r);
    }
    // 위 num1 아래 num1 다름 왜??
    public static int add (int num1, int num2){
        int result = num1+ num2;// 스택에 들어가는 int result 지역 변수

        return result;
    }



}
