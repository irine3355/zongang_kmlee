package exam02;

public class DecorateCalculator implements Calculator {
    private Calculator calculator;

    public DecorateCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public long factorial(long num){
        long stime = System.currentTimeMillis(); // 작업 시작 시간
        try{
            long result = calculator.factorial(num);// 핵심 기능을 대신 수행
            return result;

        }finally {
            long etime = System.nanoTime();
            System.out.printf("걸린시간 : %d%n", etime-stime);
        }

    }
}
