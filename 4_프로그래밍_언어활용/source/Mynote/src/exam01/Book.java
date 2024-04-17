package exam01;
//다음과 같은 자바 클래스가 주어졌을 때, 해당 클래스의 생성자를 작성하고, 두 개의 객체를 생성하여 값을 출력하세요.
public class Book {
        private String title;
        private String author;
        private int pageCount;

        // 생성자 작성
            public Book(String title, String author, int pageCount){
            this.title = title;
            this.author = author;
            this.pageCount = pageCount;
        }

        // Getter 및 Setter 메서드 생략

        public static void main (String[]args){
            // 객체 생성
            Book book1 = new Book("Java Programming", "John Smith", 300);
            Book book2 = new Book("Data Structures", "Jane Doe", 400);

            // 값 출력
            System.out.println("Book 1:");
            System.out.println("Title: " + book1.getTitle());
            System.out.println("Author: " + book1.getAuthor());
            System.out.println("Page Count: " + book1.getPageCount());

            System.out.println();

            System.out.println("Book 2:");
            System.out.println("Title: " + book2.getTitle());
            System.out.println("Author: " + book2.getAuthor());
            System.out.println("Page Count: " + book2.getPageCount());
        }
    }
}