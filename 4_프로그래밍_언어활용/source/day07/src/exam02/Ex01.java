package exam02;

public class Ex01 { // RuntimeException 실행중 체크, 실행하려면 class파일필요
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0;

            int result = num1 / num2;
            String str = null;
            System.out.println(str.toUpperCase()); //null값에 대해서 오류발생

            System.out.println(result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        catch (Exception  e) {
            e.printStackTrace();
        }


        System.out.println("매우 중요한 코드");


    }
}
