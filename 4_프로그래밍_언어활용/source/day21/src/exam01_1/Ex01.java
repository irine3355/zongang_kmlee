package exam01_1;

public class Ex01 {
    String name;
    int age;

    Ex01() {
        this("이름 없음", 1);  // this를 사용해 Person(String, int) 생성자 호출
    }

    Ex01(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {
        Ex01 noName = new Ex01();
        System.out.println(noName.name);
        System.out.println(noName.age);
    }
}

