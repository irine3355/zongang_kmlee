package Q3;

import java.util.HashMap;
import java.util.Map;

public class starS extends ShopOrder{
    private static Map<String, Integer> menus;
    static {
        menus = new HashMap<>();
        menus.put("아메리카노", 4000);

    }
    public starS(){
        super("별다방", menus);
    }
}
