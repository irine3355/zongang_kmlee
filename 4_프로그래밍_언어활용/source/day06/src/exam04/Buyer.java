package exam04;

public interface Buyer {
    void buy();

    default void order(){ // default 추가하면 인스턴스 메서드도 추가가능
        System.out.println("Buyer에서 주문");
    }

}
