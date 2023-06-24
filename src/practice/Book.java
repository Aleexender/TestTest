package practice;

public class Book {
    private String title;
    private long isbn;

    private Book(String title, long isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    static Book createByIsbn(long isbn) { // 정적 팩토리 메소드
        if (isbn == 9788966262281L) {
            return new Book("Effective Java 3/E", isbn);
        } else if (isbn == 9788998139766L) {
            return new Book("객체지향의 사실과 오해", isbn);
        }

        throw new IllegalArgumentException("일치하는 책이 없습니다.");
    }
}
