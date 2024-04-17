package exam01;

public class Board {
    //private static Board instance = new Board(); // 사용하지 않아도 처음부터 객체 생성
    private static Board instance;

    private Board() {
        System.out.println("처음부터 실행, 객체생성과 관련 없이");
    }

    public static Board getInstance() {
        if (instance == null) {
            instance = new Board(); // 필요한 시점에 단 한번만 객체 생성
        }
        return instance;
    }

    public void write() {

    }
}


//    public void setInstance(Board instance) {
//        this.instance = instance;
//    }
//}
