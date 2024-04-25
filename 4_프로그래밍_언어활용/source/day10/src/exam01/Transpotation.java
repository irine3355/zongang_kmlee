package exam01;
//?
public enum Transpotation {
    // 정적 상수 객체
    BUS(1400),
    SUBWAY(1300),
    TAXI(4500);

   private final int fare;


    Transpotation(int fare) {
    this.fare = fare;
    } // 생성은 되지만
    public int getFare(){
        return fare;
    }

    //public abstract int getTotal(int person);
}
