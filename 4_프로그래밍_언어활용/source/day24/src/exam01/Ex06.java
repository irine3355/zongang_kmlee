package exam01;
// interrupt()는 인터럽트를 발생시키는 데 사용되고,
// isInterrupted()는 인터럽트 상태를 확인하며,
// interrupted()는 인터럽트 상태를 확인하고 초기화합니다.

public class Ex06 {
    public static void main(String[] args) {
        Thread th = new Thread(() -> {
            Thread th2 = Thread.currentThread();
            int num = 0;
            while (!th2.isInterrupted()) {
                System.out.println(num++);
                for (long j = 0; j < 1000000000L; j++) ;
            }
        });
        th.start();
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){}

        th.interrupt();// isInterrupted()->true  interrupted() ->true
    }
}

