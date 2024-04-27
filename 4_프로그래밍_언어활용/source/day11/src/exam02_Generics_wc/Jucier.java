package exam02_Generics_wc;

import java.util.ArrayList;
// ? - Fruit, Apple, Grape
public class Jucier {
    public static void make(FruitBox<? extends Fruit> box){
        ArrayList<?> fruits = box.getItems(); // 와일드카드
        System.out.println(fruits);
    }

    //지네릭 메서드, extends만 사용가능
    public static <T extends Fruit> void make3(FruitBox <T> box){

    }


    // ? - Fruit, Apple, Grape, Object
    public static void make2 (FruitBox <? super Apple> box){
        //. 이는 Apple 클래스 또는 그 상위 클래스들을 포함하는 상자를 받을 수 있음을 의미합니다.
        ArrayList<?> fruits = box.getItems();
        System.out.println(fruits);
    }
}
