package exam01_1;

import java.util.Calendar;
import java.util.Date;

public class Ex05_q4_MayDateTest {
    public static void main(String[] args) {
        Ex05_q4_MyDate date1 = new Ex05_q4_MyDate(30, 2, 2000);
        System.out.println(date1.isValid());
        Ex05_q4_MyDate date2 = new Ex05_q4_MyDate(2, 10, 2006);
        System.out.println(date2.isValid());
    }
}

