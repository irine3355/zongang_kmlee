package exam01;

public class Student {
    private static int id;
    private String name;
    private String subject;

    public Student(int id, String name, String subject){
        this.id=id;
        this.name=name;
        this.subject=subject;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
