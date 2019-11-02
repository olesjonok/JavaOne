package lv.javaguru.demo.HomeWork.Book;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Erin Morgenstern", "The Starless Sea", 801);
        Book book2 = new Book("Lyssa Kay Adams", "The Bromance Book Club", 521);
        Book book3 = new Book("Erin Morgenstern", "The Starless Sea", 801);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println("book1 == book1 = " + (book1 == book1));
        System.out.println("book1 == book2 = " + (book1 == book2));
        System.out.println("book1 == book3 = " + (book1 == book3));
        System.out.println("book3 == book2 = " + (book3 == book2));
        System.out.println("book1.equals(book1) = " + book1.equals(book1));
        System.out.println("book1.equals(book2) = " + book1.equals(book2));
        System.out.println("book1.equals(book3) = " + book1.equals(book3));
        System.out.println("book3.equals(book2) = " + book3.equals(book2));
    }
}
