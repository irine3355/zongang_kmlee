package exam01;

public class Ex08 {
    public static void main(String[] args) throws InterruptedException {
        Ex08_1 th1 = new Ex08_1("*");
        Ex08_1 th2 = new Ex08_1("**");
        Ex08_1 th3 = new Ex08_1("***");

        th1.start();
        th2.start();
        th3.start();

        Thread.sleep(2000);//메인쓰레드에만 적용
        th1.suspend(); // 일시 정지

        Thread.sleep(2000);
        th2.suspend(); // 일시 정지

        Thread.sleep(3000);
        th1.stop(); // 정지(종료)
        th2.stop(); // 정지(종료)

        Thread.sleep(2000);
        th3.stop(); // 정지(종료)

    }
}
//그러나 volatile 키워드는 변수의 상태를 보장하지만,
// 복합적인 작업(예: 증가, 감소 등)에 대해서는 안전한 동기화를 제공하지
// 않습니다. 이러한 경우에는 synchronized 블록
// 또는 java.util.concurrent.atomic 패키지의 원자적 연산 등을 사용해야
// 합니다.

class Ex08_1 implements Runnable {

    private volatile boolean stopped = false; // 정지 X
    private volatile boolean suspended = false; // 일시정지 X
//volatile로 선언된 변수는 메인 메모리에서 직접 읽고 쓰기 때문에, 하나의
// 스레드에서 변경된 변수의 값은 다른 스레드에서 즉시 인식됩니다.
    private Thread th;

    public Ex08_1(String name) {
        th = new Thread(this, name);
    }

    @Override
    public void run() {
        while(!stopped) {
            if (!suspended) {
                System.out.println(th.getName());
                try {
                    Thread.sleep(1000);// 3개 스레드에 대해
                } catch (InterruptedException e) {}
            }
        }
    }

    public void start() {
        th.start();
    }

    public void suspend() {
        suspended = true;
    }

    public void resume() {
        suspended = false;
    }

    public void stop() {
        stopped = true;
    }
}