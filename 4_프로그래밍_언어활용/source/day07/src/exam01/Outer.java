package exam01;

public class Outer {

//    private Calculator cal2 = new Calculator() {
//        @Override
//        public int add(int num1, int num2) {
//            return num1+num2;
//        }
//    };


    public Calculator method (int num3) {
        return new Calculator() {
            // new Calculator() 는객체 힙
            // Calculator cal 스택에 있음
            @Override
            public int add(int num1, int num2) {
                return num1+num2+num3;
            }
        };


    }
}
