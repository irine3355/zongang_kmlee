package exam03_q5;

public interface CoffeeShop {
    CoffeeShop pEnter(Person person);//Person 클래스 , person 메소드의 매개변수 이름

    CoffeeShop order();

    void exit();

    int getTotalSalePrice();

    String getName();

    static void showSaleSummary(CoffeeShop shop) {
        System.out.printf("%s의 총 매출액은 %d원 입니다.%n", shop.getName(), shop.getTotalSalePrice());
    }
}
