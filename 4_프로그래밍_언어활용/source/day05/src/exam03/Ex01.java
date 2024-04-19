package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Animal human = new Human();
        human.move();
        Animal tiger = new Tiger();
        tiger.move();
        Animal bird = new Bird();
        bird.move();

        Animal[] animals = new Animal[3];
        animals[1] = human;
        animals[1] = tiger;
        System.out.println(animals[3]);
    }
}
