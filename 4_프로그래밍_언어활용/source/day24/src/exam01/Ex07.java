package exam01;

public class Ex07 {

    public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000); // waiting
                } catch (InterruptedException e) { //runnable
                    System.out.println("InterruptedException 발생!");
                }
            }

        });

        Thread.sleep(3000);
        th.interrupt();
    }
}
