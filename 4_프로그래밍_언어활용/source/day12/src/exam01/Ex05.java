
package exam01;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex05 {
    public static void main(String[] args) {
        //HashSet<Book> books = new HashSet<>();
        Set<Book> books = new TreeSet<>(Comparator.reverseOrder());
// "books"라는 이름의 Set을 생성합니다. 이 Set은 Book 객체를 저장할 것으로 가정됩니다.
        // TreeSet을 사용하여 Set을 초기화
        //set 상위인터페이스 하위인터페이스 TreeSet. 코드에서는 TreeSet을 사용하고 있지만, 변수 books는 그저 Set 인터페이스 타입으로 선언되어 있기 때문에, 다른 Set 인터페이스를 구현한 클래스로 변경할 수 있습니다.
        //Comparator.reverseOrder()는 내림차순으로 정렬하는 Comparator를 생성합니다.
        books.add(new Book(1003, "책4", "저자4"));
        books.add(new Book(1004, "책5", "저자5"));
        books.add(new Book(1000, "책1", "저자1"));
        books.add(new Book(1001, "책2", "저자2"));
        books.add(new Book(1001, "책2", "저자2"));
        books.add(new Book(1002, "책3", "저자3"));


        for (Book book : books) {// book 변수 "Book" 클래스 books  반복 가능한(iterable) 컬렉션(예: 배열, 리스트)
            System.out.println(book);
        }
    }
}
