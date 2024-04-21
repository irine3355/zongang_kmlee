package exam02;

public class SuperCar extends Car{
    @Override
    public void press() {
        System.out.println("악셀레이터 밟고");
    }

    public void startup() {
        System.out.println("시동걸기");
    }



    @Override
    public void turnoff() {
        System.out.println("시동 끄기");
    }

//    public void run(){ //템플릿 메서드 패턴 정의
//        press();
//        startup();
//        turnoff();
//    }
}

