package exam02;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Ex02 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
/*
        int year = today.get(ChronoField.YEAR);
        int month = today.get(ChronoField.MONTH_OF_YEAR);
        int day = today.get(ChronoField.DAY_OF_MONTH);
        int yoil = today.get(ChronoField.DAY_OF_WEEK);
*/
        int year = today.getYear();
        int month = today.getMonthValue();




    }
}
