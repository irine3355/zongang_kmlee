package exam02;

public enum Transpotation {


    BUS(1350){
        public int getTotal(int person){
            return getFare()*person;
        } // Transportation 객체, 추상 메서드 있을 경우 완전히 구현 내용을 정의해야 객체 생성 가능
    },
    SUBWAY(1450){
        public int getTotal(int person){
            return getFare()*person;
        }
    },
    TAXI(4800){
        public int getTotal(int person){
            return getFare() * person;
        }
    };

    private final int fare;

    Transpotation(int fare) {

        this.fare = fare;
    }

    public int getFare() {
        return fare;
    }

    public abstract int getTotal(int person);// 추상메서드
}
