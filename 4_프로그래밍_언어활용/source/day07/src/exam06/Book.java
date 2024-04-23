package exam06;

public class Book {
    private int isbn; //도서번호
    private String title;
    private String author; //책 저자

    public Book(int isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    } //주어진 isbn, title, author 값을 사용하여 Book 객체를 초기화하는 생성자입니다. 주어진 값들을 각각의 멤버 변수에 할당합니다.

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book)obj;
            return isbn == book.isbn;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("isbn=%d, title=%s, author=%s%n", isbn, title,author);
    }
}
