package exam04;

public class Ex01 {
    public static void main(String[] args) {

        LoginService service = new LoginService();

        try{
            service.login("user02", "123456");
        } catch (RuntimeException e ) {
            System.out.println(e.getMessage());


        }
    }
}
