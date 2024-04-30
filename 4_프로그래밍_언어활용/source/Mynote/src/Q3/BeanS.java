package Q3;

import java.util.HashMap;
import java.util.Map;

public class BeanS extends ShopOrder{
    private static Map<String, Integer> menus;
    static {
        menus = new HashMap<>();
        menus.put("라떼", 4500);

    }
    public BeanS(){
        super("콩다방", menus);
    }
}
