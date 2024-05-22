package exam01_1.exam06_q6_card;



public class Ex06_q6_cardCompany {
    private static Ex06_q6_cardCompany insstance = new Ex06_q6_cardCompany();

    private Ex06_q6_cardCompany(){}

    public static Ex06_q6_cardCompany getInstance() {
        if(insstance == null)
            insstance = new Ex06_q6_cardCompany();
        return insstance;
    }
    public Ex06_q6_card createCard(){
        Ex06_q6_card card = new Ex06_q6_card();
        return card;
    }
}
