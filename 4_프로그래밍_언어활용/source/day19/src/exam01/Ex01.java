package exam01;

public class Ex01 {
    public static void main(String[] args) {
        //%d정수 %f실수 %s문자열  %c문자
        /**
         * %자리수s  공백이 앞에
         * %-자리수s 공백이 뒤에
         */
        System.out.print("----");
        System.out.printf("%10s", "ab");
        System.out.println("----");

        System.out.print("----");
        System.out.printf("%-10s", "ab");
        System.out.println("----");

        System.out.print("----");
        System.out.printf("%*10s", "ab");
        System.out.println("----");

        System.out.print("----");
        System.out.printf("%5d", 100);
        System.out.println("----");

    }
}
