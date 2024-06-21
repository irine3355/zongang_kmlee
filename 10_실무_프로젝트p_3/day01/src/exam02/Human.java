package exam02;

public class Human extends Animal{

    @Override
    public void move() {
        System.out.println("Human move");
    }

    public  void spiking(){
        System.out.println("Human spiking");
    }
}
