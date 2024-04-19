package exam03;

public class Ex02 {
    public static void main(String[] args) {
        Animal[] animals = {new Human(), new Bird(), new Tiger()};
        // Animal[] animals = new Animal[3];
        // animals[0] = new Human();
        // animals[1] = new Bird();
        // animals[2] = new Tiger();

        for (Animal animal : animals) {  //  상된 for 루프   //    Animal 클래스의 인스턴스인 animal , animals 배열
            animal.move();

            if (animal instanceof Human) {
                Human human = (Human) animal; //animal 객체를 Human 클래스 타입으로 다운캐스팅합니다.
                human.reading();
            } else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();

            }

        }

    }
}
