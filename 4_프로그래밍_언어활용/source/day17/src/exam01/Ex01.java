package exam01;

import java.util.Calendar;

public class Ex01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
    }


public static void printDate(Calendar cal){
    int year = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.MONTH+1);
    int day = cal.get(Calendar.DAY_OF_MONTH);

    System.out.printf("year=%d, month=%d, day=%d%n", year, month, day);
}
}