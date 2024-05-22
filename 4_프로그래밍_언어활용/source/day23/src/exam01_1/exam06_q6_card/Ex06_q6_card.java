package exam01_1.exam06_q6_card;

public class Ex06_q6_card {
    private int cardNumber;
    private static int serialNum = 1000;

    Ex06_q6_card() {
        serialNum++;
        cardNumber = serialNum;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}
