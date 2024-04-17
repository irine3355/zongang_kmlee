package exam02;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        String[] strs = {"가나", "다라", "마바"};
        Arrays.stream(strs).forEach( System.out::println);


      /*  for (String str: strs) {
            System.out.println(str);
        } */



        /*
       // for (int i = 0; i< strs.length; i++){
            System.out.println(strs[i]);
        } */
    }
}
