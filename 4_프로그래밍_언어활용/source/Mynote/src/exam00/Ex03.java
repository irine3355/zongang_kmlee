package exam00;

public class Ex03 {

    public static void main(String[] args) {
// add 메서드가 정의되어 있지 않습니다. Ex01 add함수 정의 가져오려면?
        int num1 = 10;
        int num2 = 20;
        Ex01 ex = new Ex01();
        int sum = ex.add(ex.num1, ex.num2);

        System.out.println(sum);
    }

}
