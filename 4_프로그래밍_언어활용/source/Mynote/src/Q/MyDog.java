package Q;

public class MyDog {
    String name;
    String type;

    public MyDog(String type, String name) {
        this.type = type;
        this.name = name;
    }
    @Override
    public String toString() {
        return type + " " + name;
    }
}
 class Q4 {
    public static void main(String[] args) {
        //
        MyDog dog = new MyDog ("멍멍이", "진돗개");
        System.out.println(dog);

    }
}