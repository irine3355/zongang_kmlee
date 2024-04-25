package exam03;

public class Ex02 {
    public static void main(String[] args) {
        String fileName = "image.png";
      //  String extension = fileName.substring(-3);
        String extension2 = fileName.substring(fileName.length() - 3, fileName.length());
        System.out.println(extension2);
    }
}
