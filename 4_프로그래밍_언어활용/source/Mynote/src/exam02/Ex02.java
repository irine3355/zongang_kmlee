package exam02;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//import java.io.IOException;
//import javax.lang.model.util.Elements;
//import javax.swing.text.html.HTML;
//import java.io.IOException;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

//Jsoup: HTML 파싱 및 웹 스크래핑을 위한 라이브러리로, HTML 문서를 파싱하고 선택적으로 데이터를 추출할 수 있습니다.
//HtmlUnit: 웹 브라우저로부터 데이터를 가져오고 JavaScript를 실행하여 웹 페이지를 스크래핑할 수 있는 자바 기반의 라이브러리입니다.
//Jaunt: 간편하게 웹 스크래핑을 수행할 수 있는 자바 라이브러리로, Jsoup과 유사한 기능을 제공합니다.
//        HttpClient: Apache의 HttpClient 라이브러리를 사용하여 웹페이지의 HTML을 가져오고 웹 스크래핑할 수 있습니다.
//        Selenium: 웹 애플리케이션을 테스트하기 위한 도구이지만, 웹 스크래핑에도 사용할 수 있습니다. 웹 브라우저를 제어하여 웹 페이지를 스크래핑합니다.


public class Ex02 {
//    public static void main(String[] args) {
//        String url = "https://news.naver.com/section/101";
//
//        try {
//            // 네이버 뉴스 페이지를 Jsoup을 사용하여 가져옴
//            Document doc = Jsoup.connect(url).get();
//
//            // 뉴스 기사를 포함하는 요소들을 선택
//            Elements newsArticles = doc.select("div.list_body > ul > li");
//
//            // 각 기사에서 제목과 링크 추출
//            for (Element article : newsArticles) {
//                Element titleElement = article.selectFirst("a");
//                String title = titleElement.text();
//                String link = titleElement.attr("href");
//
//                // 쿠팡과 관련된 기사만 출력
//                if (title.contains("쿠팡")) {
//                    System.out.println("Title: " + title);
//                    System.out.println("Link: " + link);
//                    System.out.println();
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}