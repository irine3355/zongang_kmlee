package exam01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex05 {
    public static void main(String[] args) {
        String strDate = "05/09/2024 15:16";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy HH:mm");
       // LocalTime date = LocalDateTime.parse(strDate, formatter);

    }
}
