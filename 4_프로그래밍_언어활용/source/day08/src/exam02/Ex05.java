package exam02;

public class Ex05 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(100);
        String str = sb.append("ABC")
                .append("DEF")
                .append(" GHI")
                .toString();
//        StringBuffer sb2 = sb.append("ABC");
//        StringBuffer sb3 = sb.append("DEF");
        System.out.println(str);
    }
}
