package ch11;

class Book {

    //필드 선언
    String title;
    String author;


    //생성자 작성
    Book(){
        this("무제","미상");
//        this.title = "무제";
//        this.author = "미상";
    }
    //생성자 작성
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
}
public class BookTest {
    static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("자바를 자바라", "용쌤");

        System.out.println("제목: " + book1.title + " | 작가 : " + book1.author);

        System.out.println("제목: " + book2.title + " | 작가 : " + book2.author);


    }

}