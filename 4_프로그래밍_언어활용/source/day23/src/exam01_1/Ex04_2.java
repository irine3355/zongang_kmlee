package exam01_1;

public class Ex04_2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        char operator = '*';
        int result = 0;

        switch (operator){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("dfsdfsdfsdf");
                return;

        }
        System.out.println(result);
    }

}
