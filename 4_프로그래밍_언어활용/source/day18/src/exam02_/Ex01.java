package exam02_;

import java.time.LocalDate;

public class Ex01 {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        LocalDate startDate = LocalDate.of(today.getYear(), today.getMonth(),1);

        int yoil = startDate.getDayOfWeek().getValue();
        System.out.println(yoil);


       // LocalDate endDate = startDate.plus(month(1).minusDays(1));
    //    System.out.println(endDate);
    }
}


