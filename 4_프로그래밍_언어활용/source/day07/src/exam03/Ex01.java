package exam03;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        Resources res = new Resources();
        Resources2 res2 = new Resources2();

        try (res; res2) {
            {

            }
            ;
//            AutoCloseable auto = res;
//            auto.close();

        }// res가 autoclosable 인터페이스 구현 객체 인지 체크

        catch (Exception e) {
            e.printStackTrace();
        }

    }
}

