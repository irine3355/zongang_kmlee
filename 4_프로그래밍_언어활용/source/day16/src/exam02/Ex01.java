package exam02;

import java.util.Date;

public class Ex01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        int year = date.getYear();
        int month = date.getMonth();
        System.out.printf("year=%d,month=%d%n", year, month + 1);
        long apochTime = date.getTime(); //1970.1.1 , 1000분의 1초 단이로 카운팅
        // 유닉스 시간(Unix time)의 시작일로,
        System.out.println(apochTime);
    }
}

