package exam00;

public class Singleton {

    private static Singleton Nkm = new Singleton();

    private Singleton() {} // 생성자

    public static Singleton getInstance() {
        if (Nkm == null) {
            Nkm = new Singleton();
        }

        return Nkm;
    }
}

