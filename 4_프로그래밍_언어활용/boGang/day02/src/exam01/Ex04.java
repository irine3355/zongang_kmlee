package exam01;

public class Ex04 {
    public static void main(String[] args) {
        int result1 = add(10, 20);
        int result2 = add(10, 20, 30);
        System.out.println(result1);
        System.out.println(result2);
    }

    public static int add (int num1, int num2){
        return num1 +num2;
    }

    //  함수명이 동일하지만 함수의 시그니쳐를 다르게 정의 해서 여러개를 정의 하는 방식 메서드 오버로드
    public static int add (int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

}
