package exam01;

public class Article {
    private String subject;
    private String content;

    public Article(String subject, String content) {
        this.subject = subject;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
