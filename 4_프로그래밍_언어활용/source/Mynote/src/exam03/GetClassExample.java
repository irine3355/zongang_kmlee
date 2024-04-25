package exam03;
//다음은 getClass() 메서드를 사용하여 객체의 클래스 정보를 가져오는 간단한 예제입니다:
public class GetClassExample {
    public static void main(String[] args) {
        String str = "Hello";
        Class<?> strClass = str.getClass();
        System.out.println("Class of str: " + strClass.getName());

        Integer num = 123;
        Class<?> numClass = num.getClass();
        System.out.println("Class of num: " + numClass.getName());
    }
}
