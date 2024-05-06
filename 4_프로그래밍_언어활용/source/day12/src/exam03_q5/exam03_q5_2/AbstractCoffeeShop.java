package exam03_q5.exam03_q5_2;

import java.util.Map;

public abstract class AbstractCoffeeShop implements CoffeeShop {
  
    private String sName; // 커피샵 이름
    private Map<String, Integer> menus;
    private Person person;

    public AbstractCoffeeShop(String name, Map<String, Integer> menus) {
        this.sName = name;
        this.menus = menus;

    }

    @Override
    public CoffeeShop pEnter(Person person) {
        this.person = person;
        System.out.printf("%s님이 %s에 입장하였습니다. %n", person.getName(), sName);

        return this;
    }


    @Override
    public CoffeeShop order() {
        String menu = person.getMenu();
        int price = menus.getOrDefault(menu, 0);
        System.out.printf("%s님이 %s에서 %s를 %d원에 주문했습니다.%n", person.getName(), sName, menu, price);

        return this;
    }


    public String getName() {
        return sName;
    }

}
