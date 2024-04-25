package exam02;

public enum Transpotation {


    BUS(1350){
        public int getTotal(int person){
            return getFare()*person;
        }
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

    public abstract int getTotal(int person);
}
