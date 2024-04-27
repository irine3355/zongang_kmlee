package exam02_Generics_wc;

import java.util.ArrayList;

public class Ex03 {
    public static void main(String[] args) {
        FruitBox<Toy> toyBox = new FruitBox<>();
        toyBox.add(new Toy());
     //   Jucier.make(toyBox); // Apple, Grape, Fruit 만 가능
        // 즉 <? extends 타입> 와일드카드의 상한 제한
    }


}
