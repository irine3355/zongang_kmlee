package exam02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;

public class Ex04 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();


        String yoilStr = dayOfWeek.getDisplayName(TextStyle.FULL, );
    }
}
