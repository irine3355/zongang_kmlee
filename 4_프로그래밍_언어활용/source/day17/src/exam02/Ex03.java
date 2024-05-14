package exam02;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ex03 {
    LocalDate today = LocalDate.now();
    Month month = today.getMonth();

    Locale locale = new Locale("ko","kr");
    String yoilStr = month.getDisplayName(TextStyle.FULL, locale);


}
