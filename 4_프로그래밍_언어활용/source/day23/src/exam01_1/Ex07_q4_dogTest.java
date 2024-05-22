package exam01_1;

public class Ex07_q4_dogTest {
    public static void main(String[] args) {
        Ex07_q4_dog[] dogArray = new Ex07_q4_dog[5];
        dogArray[0] = new Ex07_q4_dog("멍멍이", "치아와");
        dogArray[1] = new Ex07_q4_dog("뽀삐", "진돗개");
        dogArray[2] = new Ex07_q4_dog("순심이", "삽살개");
        dogArray[3] = new Ex07_q4_dog("철이", "마르티스");
        dogArray[4] = new Ex07_q4_dog("삐쭈", "푸들");
//for(int i=0; i<dogArray.length; i++){
//    System.out.println(dogArray[i].showDogInfo());
//}//  dogArray배열에 저장된 강아지 객체의 개수만큼 반복합니다.

for(Ex07_q4_dog dog:dogArray){
    System.out.println(dog.showDogInfo());
}
    }

    }

