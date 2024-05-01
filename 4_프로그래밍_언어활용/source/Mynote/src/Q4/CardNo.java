package Q4;

import java.util.Arrays;

public class CardNo {

    private static int nextCardNum = 1000;
    private int cardNum;

    public CardNo() {
        this.cardNum = nextCardNum++;
    }

    public int getCardNum() {
        return cardNum;
    }

    public static void main(String[] args) {
        CardNo card1 = new CardNo();
        CardNo card2 = new CardNo();

        System.out.println(card1.getCardNum());
        System.out.println(card2.getCardNum());
    }


}