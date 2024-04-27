package exam01_Generics;
// T는 Fruit 의 하위클래스, 충분한 정보가 있으므로 오브텍가 아니라 T를 Fruit
public class Box <T extends Fruit & Eatable > { // Box <T> 지네릭 클래스, T 타입 매개변수, box 원시타입
private T item;

// private static T item2;  x사용불가
// private  static T[] nums = new T[3]; 사용불가 ,  배열에서 공간 생성을 위해서 명확해야 함.
public void setItem(T item){
    this.item = item;
}

public T getItem () {
    return item;
}

public String toString(){
    //T == Fruit
    //item.get() x
    return null;
}
}
