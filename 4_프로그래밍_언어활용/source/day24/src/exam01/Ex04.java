package exam01;

public class Ex04 {
    public static void main(String[] args) {

          Runnable r1 = ()-> {
              for(int i =0; i<300; i++){
                  System.out.println("-");
                  for(long j=0; j<1000000L; j++);
              }
          };
        Runnable r2 = ()-> {
            for(int i =0; i<300; i++){
                System.out.println("=");
                for(long j=0; j<1000000L; j++);
            }
        };

        Thread th1 = new Thread(r1);
        Thread th2 = new Thread(r2);
        th1.setPriority(Thread.MAX_PRIORITY); //10
        th1.setPriority(Thread.MIN_PRIORITY);
        System.out.printf("th1:%d, th%d%n",
                th1.getPriority(),th2.getPriority());

        th1.start();
        th2.start();
        System.out.println("작업종료!");// 메인쓰레드에서
    }
}
