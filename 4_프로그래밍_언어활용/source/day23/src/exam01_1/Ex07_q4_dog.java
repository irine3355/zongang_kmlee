package exam01_1;

public class Ex07_q4_dog {
    private String name;
    private String type;

    public Ex07_q4_dog(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String showDogInfo() {
        return name + ", " + type;
    }
}
