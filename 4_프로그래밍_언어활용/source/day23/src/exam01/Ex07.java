//package exam01;
//
//public class Ex07 {
//    public static void main(String[] args) {
//        private static boolean autoSave = false;
//        Thread th = new Thread(() -> {
//            while (true) {
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                }
//
//
//                System.out.println("저장!");
//            }
//        });
//        th.start();
//        th.setDaemon(true);
//        for (int i = 0; i <= 10; i++) {
//            Thread.sleep(1000);
//            System.out.println(i);
//            if (i == 3) {
//                autoSave = true;
//            }
//        }
//    }
//}
