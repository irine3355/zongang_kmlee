package Q3;

import java.util.Map;

public abstract class ShopOrder implements CoffeeShop {

    private String Name;
    private Map<String, Integer> menus;
    private Person person;

    public ShopOrder(String name, Map<String, Integer> menus) {
        this.Name = name;
        this.menus = menus;
    }

    @Override
    public CoffeeShop pEnter(Person person) {
        this.person = person;
        return this;
    }

    public String getName() {
        return Name;
    }

    @Override
    public CoffeeShop order() {
        String menu = person.getMenu();


        System.out.printf("%s는 %d원을 내고 %s에서 %s를 사 마셨습니다.", person.getName(), menus, Name, menus);
        return this;
    }

}







