import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Ex01 {

        public static void main(String[] args) {
            // 이미지 파일 경로
            String imagePath = "gangsanim.jpg";

            try {
                // 이미지 파일 읽기
                BufferedImage image = ImageIO.read(new File(imagePath));

                // 이미지를 ASCII 아트로 변환하여 출력
                convertToAscii(image);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static void convertToAscii(BufferedImage image) {
            // 이미지 크기
            int width = image.getWidth();
            int height = image.getHeight();

            // ASCII 아트로 변환하여 출력
            for (int y = 0; y < height; y += 2) {
                for (int x = 0; x < width; x++) {
                    // 픽셀의 밝기 계산
                    int pixelBrightness = getBrightness(image.getRGB(x, y));

                    // ASCII 문자 선택
                    char asciiChar = getAsciiChar(pixelBrightness);

                    // 출력
                    System.out.print(asciiChar);
                }
                System.out.println();
            }
        }

        private static int getBrightness(int rgb) {
            // 픽셀의 RGB 값을 이용하여 밝기 계산
            int red = (rgb >> 16) & 0xff;
            int green = (rgb >> 8) & 0xff;
            int blue = rgb & 0xff;
            return (red + green + blue) / 3;
        }

        private static char getAsciiChar(int brightness) {
            // 밝기 값에 따라 ASCII 문자 선택
            if (brightness < 64) {
                return '@';
            } else if (brightness < 128) {
                return '#';
            } else if (brightness < 192) {
                return '*';
            } else if (brightness < 256) {
                return '.';
            } else {
                return ' ';
            }
        }
    }

