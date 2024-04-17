package exam01;

public class Book {
    private String title;
    private String author;
    private int pageCount;

    // 생성자 작성
    public Book(String title, String author, int pageCount) {
        this.title = title;  // this는  멤버 변수 title 이하 동일
        this.author = author;
        this.pageCount = pageCount;
    }



    // Getter 및 Setter 메서드
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }

    public static void main(String[] args) {
        // 객체 생성
        Book book1 = new Book("Java Programming", "John Smith", 300);
        Book book2 = new Book("Data Structures", "Jane Doe", 400);

        System.out.println(book1);
        System.out.println(book2);

    }
}