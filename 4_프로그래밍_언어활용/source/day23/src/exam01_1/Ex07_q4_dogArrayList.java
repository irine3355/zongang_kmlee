package exam01_1;

import java.util.ArrayList;

public class Ex07_q4_dogArrayList {
    public static void main(String[] args) {

        ArrayList<Ex07_q4_dog> list = new ArrayList<Ex07_q4_dog>();
        list.add(new Ex07_q4_dog("멍멍이", "치아와"));
        list.add(new Ex07_q4_dog("뽀삐", "진돗개"));
        list.add(new Ex07_q4_dog("순심이", "삽살개"));
        list.add(new Ex07_q4_dog("철이", "마르티스"));
        list.add(new Ex07_q4_dog("삐쭈", "푸들"));
for(int i =0; i<list.size(); i++){
    System.out.println(list.get(i).showDogInfo());
}

for(Ex07_q4_dog dog: list){
    System.out.println(dog.showDogInfo());
}
    }
    }
