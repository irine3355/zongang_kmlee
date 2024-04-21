package exam04;

public class Order implements Seller, Buyer {
    @Override
    public void buy() {
        System.out.println("구매!");
    }

    @Override
    public void sell() {
        System.out.println("판매");
    }
public void order (){
       Buyer.super.order();
} // Buyer Seller 두 클래스중에 order메서드를 어디에서 호출할지 정의 

}
