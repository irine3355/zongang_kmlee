package exam00;

public class ExTostring {


        int bookNumber;
        String bookTitle;

    ExTostring(int bookNumber, String bookTitle) {
            this.bookNumber = bookNumber; // 생성자 내에서 매개변수로 받은 값을 객체의 필드에 할당하는 역할을 합니다.
            this.bookTitle = bookTitle;
        }



    @Override
        public String toString() { // toString() 메서드 재정의
            return bookTitle + "," + bookNumber;
        }
    }



