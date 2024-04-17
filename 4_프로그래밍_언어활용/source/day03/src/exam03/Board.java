package exam03;

public class Board {
    private static Board instance = new Board();


    private Board (){

    }

    public static Board getInstance() {
        return instance;
    }

    public static Board setInstance(Board instance) {
        return instance;
    }



}
