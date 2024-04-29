package exam03_q5;

public class Ex01 {
    public static void main(String[] args) {
        StarBucks starBucks = new StarBucks();
        CoffeeBean coffeeBean = new CoffeeBean();

        Person kim = new Person("김씨", 10000);
        Person lee = new Person("이씨", 15000);

        kim.setMenu("아메리카노");
        lee.setMenu("라떼");

        try{
            starBucks.enter(kim).order().exit(); // 메서드 체인
            coffeeBean.enter(lee).order().exit();

            System.out.println(kim);
            System.out.println(lee);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

//        starBucks.enter(kim);
//        starBucks.order();
//        starBucks.exit();

        System.out.println("커피숍별 총 매출요약");
        CoffeeShop.showSaleSummary(starBucks);
        CoffeeShop.showSaleSummary(coffeeBean);
    }
}
