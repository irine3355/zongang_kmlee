package exam01_1;

public class Ex04_q3 {
    public static void main(String[] args) {
        int dan;
        int times;

        for(dan = 2; dan <=9; dan++){
            for(times = 1; times <=9; times++){
                if( times > dan) break;
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
            System.out.println();
        }
    }

}