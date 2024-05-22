package exam01;

public class book {
    private int isbn;
    private String title;
    private String author;

    public book(String author, String title, int isbn) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    public book() {
        super();
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
