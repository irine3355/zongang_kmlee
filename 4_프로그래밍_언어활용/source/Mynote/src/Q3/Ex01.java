package Q3;

public class Ex01 {

    public static void main(String[] args) {

        starS stars = new starS();
        BeanS beans = new BeanS();

        Person kim = new Person("김씨");
        Person lee = new Person("이씨");

        kim.setMenu("아메리카노");
        lee.setMenu("라떼");

        try{
            starS.pEnter(kim).order();
            BeanS.pEnter(lee).order();

            System.out.println(kim);
            System.out.println(lee);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
