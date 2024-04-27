package exam02_Generics_wc;

import exam01_Generics.Fruit;
import exam02_Generics_wc.Grape;

public class Ex02 {
    public static void main(String[] args) {
        FruitBox<Grape> grapeBox = new FruitBox<>();
        grapeBox.add(new Grape());
        grapeBox.add(new Grape());

        Jucier.make(grapeBox);
    }
}
