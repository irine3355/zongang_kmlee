package exam03_q5.exam03_q5_2;

public class Ex01 {
    public static void main(String[] args) {
        StarBucks starBucks = new StarBucks();
        CoffeeBean coffeeBean = new CoffeeBean();

        Person kim = new Person("김씨");
        Person lee = new Person("이씨");

        kim.setMenu("아메리카노");
        lee.setMenu("라떼");

        starBucks.pEnter(kim).order(); // 메서드 체인
        coffeeBean.pEnter(lee).order();

//        try{
//            starBucks.pEnter(kim).order(); // 메서드 체인
//            coffeeBean.pEnter(lee).order();
//
//
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        }




    }
}
