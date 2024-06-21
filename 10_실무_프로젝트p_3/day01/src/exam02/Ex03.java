package exam02;

public class Ex03 {
    public static void main(String[] args) {
        Animal human = new Human();
        human.move();

        Animal[] animals = new Animal[3];
        animals[0] = new Human();
        for (Animal animal : animals) {
            animal.move();
            if (animal instanceof Human human1) {
               // Human human1 = (Human) animal;
                human1.spiking();
            }

        }

    }

}
